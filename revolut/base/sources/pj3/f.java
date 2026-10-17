package pj3;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f236634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yhm.m f236635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fj3.f f236636c;

    public f(Data story, yhm.m mVar, fj3.f targetTheme) {
        Intrinsics.checkNotNullParameter(story, "story");
        Intrinsics.checkNotNullParameter(targetTheme, "targetTheme");
        this.f236634a = story;
        this.f236635b = mVar;
        this.f236636c = targetTheme;
    }

    public static f a(f fVar, Data story, yhm.m mVar, fj3.f targetTheme, int i) {
        if ((i & 1) != 0) {
            story = fVar.f236634a;
        }
        if ((i & 2) != 0) {
            mVar = fVar.f236635b;
        }
        if ((i & 4) != 0) {
            targetTheme = fVar.f236636c;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(story, "story");
        Intrinsics.checkNotNullParameter(targetTheme, "targetTheme");
        return new f(story, mVar, targetTheme);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f236634a, fVar.f236634a) && Intrinsics.f(this.f236635b, fVar.f236635b) && this.f236636c == fVar.f236636c;
    }

    public final int hashCode() {
        Object obj2;
        int iHashCode = this.f236634a.hashCode() * 31;
        int iHashCode2 = 0;
        yhm.m mVar = this.f236635b;
        if (mVar != null && (obj2 = mVar.f314193a) != null) {
            iHashCode2 = obj2.hashCode();
        }
        return this.f236636c.hashCode() + ((iHashCode + iHashCode2) * 31);
    }
}
