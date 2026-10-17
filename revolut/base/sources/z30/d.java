package z30;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f319108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f319109c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f319110g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l f319111h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String assetSymbol, String assetSymbolHighlighted, String experience, String title, String str, List tags, l feedbackRequirement) {
        super(n.STARS);
        Intrinsics.checkNotNullParameter(assetSymbol, "assetSymbol");
        Intrinsics.checkNotNullParameter(assetSymbolHighlighted, "assetSymbolHighlighted");
        Intrinsics.checkNotNullParameter(experience, "experience");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(feedbackRequirement, "feedbackRequirement");
        this.f319108b = assetSymbol;
        this.f319109c = assetSymbolHighlighted;
        this.d = experience;
        this.e = title;
        this.f = str;
        this.f319110g = tags;
        this.f319111h = feedbackRequirement;
    }

    @Override // z30.e
    public final String a() {
        return this.d;
    }

    @Override // z30.e
    public final l b() {
        return this.f319111h;
    }

    @Override // z30.e
    public final List c() {
        return this.f319110g;
    }

    @Override // z30.e
    public final String d() {
        return this.f;
    }

    @Override // z30.e
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f319108b, dVar.f319108b) && Intrinsics.f(this.f319109c, dVar.f319109c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f) && Intrinsics.f(this.f319110g, dVar.f319110g) && this.f319111h == dVar.f319111h;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.f319108b.hashCode() * 31, 31, this.f319109c), 31, this.d), 31, this.e);
        String str = this.f;
        return this.f319111h.hashCode() + p.a.d((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.f319110g);
    }
}
