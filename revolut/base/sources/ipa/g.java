package ipa;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f167695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f167696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f167697c;
    public final i d;
    public final e e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f167698g;

    public g(String str, int i, String str2, i iVar, e eVar, boolean z, l lVar) {
        this.f167695a = str;
        this.f167696b = i;
        this.f167697c = str2;
        this.d = iVar;
        this.e = eVar;
        this.f = z;
        this.f167698g = lVar;
    }

    public final i a() {
        return this.d;
    }

    public final int b() {
        return this.f167696b;
    }

    public final String c() {
        return this.f167697c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!getClass().equals(obj2 != null ? obj2.getClass() : null)) {
            return false;
        }
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.push_message.api.models.PushMessage");
        return Intrinsics.f(this.f167695a, ((g) obj2).f167695a);
    }

    public final int hashCode() {
        return this.f167695a.hashCode();
    }
}
