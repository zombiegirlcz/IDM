package ie;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class j {
    public static final h d = new h(0);
    public static final i e = new i(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oe.c f160525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f160526b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f160527c = null;

    public j(oe.c cVar) {
        this.f160525a = cVar;
    }

    public static void a(oe.c cVar, String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            cVar.h(str, "aqs.".concat(str2)).createNewFile();
        } catch (IOException e2) {
        }
    }
}
