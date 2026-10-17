package z30;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f319102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f319103c;
    public final String d;
    public final String e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f319104g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String assetUrl, String experience, String title, String str, List tags) {
        super(n.DEFAULT);
        l feedbackRequirement = l.NONE;
        Intrinsics.checkNotNullParameter(assetUrl, "assetUrl");
        Intrinsics.checkNotNullParameter(experience, "experience");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(feedbackRequirement, "feedbackRequirement");
        this.f319102b = assetUrl;
        this.f319103c = experience;
        this.d = title;
        this.e = str;
        this.f = tags;
        this.f319104g = feedbackRequirement;
    }

    @Override // z30.e
    public final String a() {
        return this.f319103c;
    }

    @Override // z30.e
    public final l b() {
        return this.f319104g;
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
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f319102b, bVar.f319102b) && Intrinsics.f(this.f319103c, bVar.f319103c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && this.f319104g == bVar.f319104g;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f319102b.hashCode() * 31, 31, this.f319103c), 31, this.d);
        String str = this.e;
        return this.f319104g.hashCode() + p.a.d((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
    }
}
