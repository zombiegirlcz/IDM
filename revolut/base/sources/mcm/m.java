package mcm;

import com.google.common.base.Preconditions;
import java.net.SocketAddress;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes22.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f204397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f204398b;

    public m(ecm.z zVar) {
        Preconditions.checkNotNull(zVar, "eag");
        this.f204397a = new String[zVar.f124900a.size()];
        Iterator it8 = zVar.f124900a.iterator();
        int i = 0;
        while (it8.hasNext()) {
            this.f204397a[i] = ((SocketAddress) it8.next()).toString();
            i++;
        }
        Arrays.sort(this.f204397a);
        this.f204398b = Arrays.hashCode(this.f204397a);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || !(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        if (mVar.f204398b == this.f204398b) {
            String[] strArr = mVar.f204397a;
            int length = strArr.length;
            String[] strArr2 = this.f204397a;
            if (length == strArr2.length) {
                return Arrays.equals(strArr, strArr2);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f204398b;
    }

    public final String toString() {
        return Arrays.toString(this.f204397a);
    }
}
