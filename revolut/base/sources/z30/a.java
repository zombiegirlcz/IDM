package z30;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f319099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f319100c;
    public final String d;
    public final String e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f319101g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String assetSymbol, String experience, String title, String str, List tags, l feedbackRequirement) {
        super(n.ASSETS);
        Intrinsics.checkNotNullParameter(assetSymbol, "assetSymbol");
        Intrinsics.checkNotNullParameter(experience, "experience");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(feedbackRequirement, "feedbackRequirement");
        this.f319099b = assetSymbol;
        this.f319100c = experience;
        this.d = title;
        this.e = str;
        this.f = tags;
        this.f319101g = feedbackRequirement;
    }

    @Override // z30.e
    public final String a() {
        return this.f319100c;
    }

    @Override // z30.e
    public final l b() {
        return this.f319101g;
    }

    @Override // z30.e
    public final List c() {
        return this.f;
    }

    @Override // z30.e
    public final String d() {
        return this.e;
    }

    @Override // z30.e
    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f319099b, aVar.f319099b) && Intrinsics.f(this.f319100c, aVar.f319100c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && this.f319101g == aVar.f319101g;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f319099b.hashCode() * 31, 31, this.f319100c), 31, this.d);
        String str = this.e;
        return this.f319101g.hashCode() + p.a.d((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
    }
}
