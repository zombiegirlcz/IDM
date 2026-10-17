package nu0;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes19.dex */
public interface d {
    static /* synthetic */ void d(d dVar, boolean z, Function0 function0, Function0 function02, int i) {
        if ((i & 2) != 0) {
            function0 = new ns1.a(15);
        }
        if ((i & 4) != 0) {
            function02 = new ns1.a(16);
        }
        dVar.b(function0, function02, z);
    }

    void a();

    void b(Function0 function0, Function0 function02, boolean z);

    boolean c();
}
