package npi;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes13.dex */
public interface f {
    static /* synthetic */ void B(f fVar, String str, String str2, String str3, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        ((c) fVar).V(str, str2, str3, new nme.c(24));
    }

    static /* synthetic */ void J(f fVar, String str, String str2, String str3, String str4, Function1 function1, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        ((c) fVar).N(str, str2, str3, str4, false, false, function1);
    }
}
