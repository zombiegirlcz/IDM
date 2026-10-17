package gck;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class l implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f142501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f142502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f142503c;

    public l(Data intro, Data senderContact, Data introVariant) {
        Intrinsics.checkNotNullParameter(intro, "intro");
        Intrinsics.checkNotNullParameter(senderContact, "senderContact");
        Intrinsics.checkNotNullParameter(introVariant, "introVariant");
        this.f142501a = intro;
        this.f142502b = senderContact;
        this.f142503c = introVariant;
    }

    public static l a(l lVar, Data intro, Data senderContact, int i) {
        if ((i & 1) != 0) {
            intro = lVar.f142501a;
        }
        if ((i & 2) != 0) {
            senderContact = lVar.f142502b;
        }
        Data introVariant = lVar.f142503c;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(intro, "intro");
        Intrinsics.checkNotNullParameter(senderContact, "senderContact");
        Intrinsics.checkNotNullParameter(introVariant, "introVariant");
        return new l(intro, senderContact, introVariant);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f142501a, lVar.f142501a) && Intrinsics.f(this.f142502b, lVar.f142502b) && Intrinsics.f(this.f142503c, lVar.f142503c);
    }

    public final int hashCode() {
        return this.f142503c.hashCode() + kii.e.c(this.f142502b, this.f142501a.hashCode() * 31, 31);
    }
}
