package fag;

/* JADX INFO: loaded from: classes9.dex */
public final class w0 {
    private w0() {
    }

    public static String a(ffi.a aVar) {
        String strName;
        if (aVar == null || (strName = aVar.name()) == null) {
            m70.a.c(kotlin.jvm.internal.t0.f186434a);
            strName = "";
        }
        return "TRAVEL_HOTELS_SORTING_OPTIONS_".concat(strName);
    }
}
