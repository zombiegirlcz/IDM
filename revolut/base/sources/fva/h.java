package fva;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f138397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f138398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f138399c;
    public final String d;
    public final List e;

    public h(c cVar, d dVar, String str, String str2, List additionalInformation) {
        Intrinsics.checkNotNullParameter(additionalInformation, "additionalInformation");
        this.f138397a = cVar;
        this.f138398b = dVar;
        this.f138399c = str;
        this.d = str2;
        this.e = additionalInformation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f138397a, hVar.f138397a) && Intrinsics.f(this.f138398b, hVar.f138398b) && Intrinsics.f(this.f138399c, hVar.f138399c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e);
    }

    public final int hashCode() {
        c cVar = this.f138397a;
        int iHashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        d dVar = this.f138398b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str = this.f138399c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return this.e.hashCode() + ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
