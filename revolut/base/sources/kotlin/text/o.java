package kotlin.text;

import java.util.List;
import java.util.regex.Matcher;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes13.dex */
public final class o implements MatchResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matcher f187919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f187920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f187921c;
    public m d;

    public o(Matcher matcher, CharSequence input) {
        Intrinsics.checkNotNullParameter(matcher, "matcher");
        Intrinsics.checkNotNullParameter(input, "input");
        this.f187919a = matcher;
        this.f187920b = input;
        this.f187921c = new n(this);
    }

    @Override // kotlin.text.MatchResult
    public final /* bridge */ fnc.s a() {
        return g0.b(this);
    }

    @Override // kotlin.text.MatchResult
    public final n b() {
        return this.f187921c;
    }

    @Override // kotlin.text.MatchResult
    public final List c() {
        if (this.d == null) {
            this.d = new m(this);
        }
        m mVar = this.d;
        Intrinsics.h(mVar);
        return mVar;
    }

    @Override // kotlin.text.MatchResult
    public final IntRange getRange() {
        Matcher matcher = this.f187919a;
        return kotlin.ranges.f.o(matcher.start(), matcher.end());
    }

    @Override // kotlin.text.MatchResult
    public final String getValue() {
        String strGroup = this.f187919a.group();
        Intrinsics.checkNotNullExpressionValue(strGroup, "group(...)");
        return strGroup;
    }

    @Override // kotlin.text.MatchResult
    public final MatchResult next() {
        Matcher matcher = this.f187919a;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.f187920b;
        if (iEnd > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        Intrinsics.checkNotNullExpressionValue(matcher2, "matcher(...)");
        if (matcher2.find(iEnd)) {
            return new o(matcher2, charSequence);
        }
        return null;
    }
}
