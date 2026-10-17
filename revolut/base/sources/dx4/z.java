package dx4;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public interface z extends Serializable {
    long N5();

    List P6();

    Long Q1();

    int S6();

    x V8();

    String getTitle();

    default String j() {
        return com.google.android.gms.internal.mlkit_vision_face.a.o(kotlin.jvm.internal.o0.f186429a.b(getClass()).m(), ", title=", getTitle());
    }

    t t6();

    long v8();
}
