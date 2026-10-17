package z30;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f319105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f319106c;
    public final String d;
    public final String e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f319107g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String emojiIconCode, String experience, String title, String str, List tags, l feedbackRequirement) {
        super(n.EMOJI);
        Intrinsics.checkNotNullParameter(emojiIconCode, "emojiIconCode");
        Intrinsics.checkNotNullParameter(experience, "experience");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(feedbackRequirement, "feedbackRequirement");
        this.f319105b = emojiIconCode;
        this.f319106c = experience;
        this.d = title;
        this.e = str;
        this.f = tags;
        this.f319107g = feedbackRequirement;
    }

    @Override // z30.e
    public final String a() {
        return this.f319106c;
    }

    @Override // z30.e
    public final l b() {
        return this.f319107g;
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
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f319105b, cVar.f319105b) && Intrinsics.f(this.f319106c, cVar.f319106c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f) && this.f319107g == cVar.f319107g;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f319105b.hashCode() * 31, 31, this.f319106c), 31, this.d);
        String str = this.e;
        return this.f319107g.hashCode() + p.a.d((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
    }
}
