package org.jmrtd.protocol;

import java.io.Serializable;
import org.jmrtd.AccessKeySpec;

/* JADX INFO: loaded from: classes14.dex */
public class BACResult implements Serializable {
    private static final long serialVersionUID = -7114911372181772099L;
    private AccessKeySpec bacKey;
    private SecureMessagingWrapper wrapper;

    public BACResult(SecureMessagingWrapper secureMessagingWrapper) {
        this(null, secureMessagingWrapper);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || getClass() != obj2.getClass()) {
            return false;
        }
        BACResult bACResult = (BACResult) obj2;
        AccessKeySpec accessKeySpec = this.bacKey;
        if (accessKeySpec == null) {
            if (bACResult.bacKey != null) {
                return false;
            }
        } else if (!accessKeySpec.equals(bACResult.bacKey)) {
            return false;
        }
        SecureMessagingWrapper secureMessagingWrapper = this.wrapper;
        if (secureMessagingWrapper == null) {
            if (bACResult.wrapper != null) {
                return false;
            }
        } else if (!secureMessagingWrapper.equals(bACResult.wrapper)) {
            return false;
        }
        return true;
    }

    public AccessKeySpec getBACKey() {
        return this.bacKey;
    }

    public SecureMessagingWrapper getWrapper() {
        return this.wrapper;
    }

    public int hashCode() {
        AccessKeySpec accessKeySpec = this.bacKey;
        int iHashCode = (1303377669 + (accessKeySpec == null ? 0 : accessKeySpec.hashCode())) * 1234567891;
        SecureMessagingWrapper secureMessagingWrapper = this.wrapper;
        return iHashCode + (secureMessagingWrapper != null ? secureMessagingWrapper.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder();
        StringBuilder sb9 = new StringBuilder("BACResult [bacKey: ");
        Object obj2 = this.bacKey;
        if (obj2 == null) {
            obj2 = "-";
        }
        sb9.append(obj2);
        sb6.append(sb9.toString());
        sb6.append(", wrapper: " + this.wrapper);
        sb6.append("]");
        return sb6.toString();
    }

    public BACResult(AccessKeySpec accessKeySpec, SecureMessagingWrapper secureMessagingWrapper) {
        this.bacKey = accessKeySpec;
        this.wrapper = secureMessagingWrapper;
    }
}
