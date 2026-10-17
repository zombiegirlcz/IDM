package m1c;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R(\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\u0005\u0010\f¨\u0006\u000e"}, d2 = {"Lm1c/m1;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "text", "", "Lm1c/m1$a;", "Ljava/util/Map;", "()Ljava/util/Map;", "placeholders", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("text")
    @NotNull
    private final String text;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("placeholders")
    private final Map<String, a> placeholders;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\f"}, d2 = {"Lm1c/m1$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "formatting", "c", "value", "fallback", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("formatting")
        @NotNull
        private final String formatting;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("value")
        @NotNull
        private final String value;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("fallback")
        @NotNull
        private final String fallback;

        public a(String formatting, String value, String fallback) {
            Intrinsics.checkNotNullParameter(formatting, "formatting");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(fallback, "fallback");
            this.formatting = formatting;
            this.value = value;
            this.fallback = fallback;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFallback() {
            return this.fallback;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getFormatting() {
            return this.formatting;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.formatting, aVar.formatting) && Intrinsics.f(this.value, aVar.value) && Intrinsics.f(this.fallback, aVar.fallback);
        }

        public final int hashCode() {
            return this.fallback.hashCode() + p.a.c(this.formatting.hashCode() * 31, 31, this.value);
        }
    }

    public m1(LinkedHashMap linkedHashMap, String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.placeholders = linkedHashMap;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Map getPlaceholders() {
        return this.placeholders;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj2;
        return Intrinsics.f(this.text, m1Var.text) && Intrinsics.f(this.placeholders, m1Var.placeholders);
    }

    public final int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        Map<String, a> map = this.placeholders;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }
}
