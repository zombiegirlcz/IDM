package vu3;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f292242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f292243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f292244c;
    public final ArrayList d;

    public s(String title, String subtitle, String action, ArrayList stories) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(stories, "stories");
        this.f292242a = title;
        this.f292243b = subtitle;
        this.f292244c = action;
        this.d = stories;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f292242a, sVar.f292242a) && Intrinsics.f(this.f292243b, sVar.f292243b) && Intrinsics.f(this.f292244c, sVar.f292244c) && this.d.equals(sVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f292242a.hashCode() * 31, 31, this.f292243b), 31, this.f292244c);
    }
}
