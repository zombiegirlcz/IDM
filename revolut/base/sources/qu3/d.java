package qu3;

import java.io.Serializable;

/* JADX INFO: loaded from: classes22.dex */
public interface d extends Serializable {
    boolean f0();

    String getId();

    Object getValue();

    boolean k0();

    default boolean x3() {
        return (!f0() || k0() || getValue() == null) ? false : true;
    }
}
