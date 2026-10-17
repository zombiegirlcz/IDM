package ru;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class v {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final av1.c f257381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f257382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f257383c;
    public final av1.c d;
    public final ArrayList e;

    public v(av1.c cVar, String title, String str, av1.c cVar2, ArrayList eligibilityCriteria) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(eligibilityCriteria, "eligibilityCriteria");
        this.f257381a = cVar;
        this.f257382b = title;
        this.f257383c = str;
        this.d = cVar2;
        this.e = eligibilityCriteria;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f257381a, vVar.f257381a) && Intrinsics.f(this.f257382b, vVar.f257382b) && Intrinsics.f(this.f257383c, vVar.f257383c) && Intrinsics.f(this.d, vVar.d) && this.e.equals(vVar.e);
    }

    public final int hashCode() {
        av1.c cVar = this.f257381a;
        int iC = p.a.c((cVar == null ? 0 : cVar.hashCode()) * 31, 31, this.f257382b);
        String str = this.f257383c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        av1.c cVar2 = this.d;
        return this.e.hashCode() + ((iHashCode + (cVar2 != null ? cVar2.hashCode() : 0)) * 31);
    }
}
