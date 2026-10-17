package ldd;

import aw0.f4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f194070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f194071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f194072c;

    public b() {
        m70.a.c(t0.f186434a);
        this.f194070a = "";
    }

    public final boolean a(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        return Intrinsics.f(this.f194070a, listId);
    }

    public final void b(f4 focusData) {
        Intrinsics.checkNotNullParameter(focusData, "focusData");
        if (this.f194072c) {
            return;
        }
        boolean z = focusData.f10304b;
        String str = focusData.f10303a;
        if (z) {
            this.f194070a = str;
        } else if (Intrinsics.f(this.f194070a, str)) {
            m70.a.c(t0.f186434a);
            this.f194070a = "";
        }
    }

    public final boolean c(int i, String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (!listId.equals(this.f194070a) || this.f194071b == i) {
            return false;
        }
        this.f194071b = i;
        return true;
    }
}
