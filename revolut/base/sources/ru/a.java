package ru;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f257350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f257351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f257352c;
    public final i d;
    public final ArrayList e;

    public a(String businessId, String name, String str, i state, ArrayList steps) {
        Intrinsics.checkNotNullParameter(businessId, "businessId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(steps, "steps");
        this.f257350a = businessId;
        this.f257351b = name;
        this.f257352c = str;
        this.d = state;
        this.e = steps;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f257350a, aVar.f257350a) && Intrinsics.f(this.f257351b, aVar.f257351b) && Intrinsics.f(this.f257352c, aVar.f257352c) && this.d.equals(aVar.d) && this.e.equals(aVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f257350a.hashCode() * 31, 31, this.f257351b);
        String str = this.f257352c;
        return this.e.hashCode() + ((this.d.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }
}
