package jm;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f175890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f175891b;

    public a(String string, int i) {
        Intrinsics.j(string, "string");
        this.f175891b = string;
        this.f175890a = i;
    }

    public String a() {
        return this.f175891b;
    }

    public int b() {
        return this.f175890a;
    }

    public a(int i, String str) {
        this.f175890a = i;
        this.f175891b = str;
    }

    public a(String prefix) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        this.f175891b = prefix;
    }
}
