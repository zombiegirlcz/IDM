package buh;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lbuh/a;", "", "", "toString", "()Ljava/lang/String;", "", "Lbuh/a$a;", "a", "Ljava/util/List;", "getAnswers", "()Ljava/util/List;", "answers", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("questions")
    @NotNull
    private final List<AbstractC0124a> answers;

    /* JADX INFO: renamed from: buh.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0124a {

        /* JADX INFO: renamed from: buh.a$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC0125a {

            /* JADX INFO: renamed from: buh.a$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lbuh/a$a$a$a;", "Lbuh/a$a$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/util/List;", "getValue", "()Ljava/util/List;", "value", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class C0126a extends AbstractC0125a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                @lg.b("value")
                @NotNull
                private final List<String> value;

                public C0126a(List value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.value = value;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof C0126a) && Intrinsics.f(this.value, ((C0126a) obj2).value);
                }

                public final int hashCode() {
                    return this.value.hashCode();
                }
            }

            /* JADX INFO: renamed from: buh.a$a$a$b */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lbuh/a$a$a$b;", "Lbuh/a$a$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Z", "getValue", "()Ljava/lang/Boolean;", "value", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class b extends AbstractC0125a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                @lg.b("value")
                private final boolean value;

                public b(boolean z) {
                    this.value = z;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof b) && this.value == ((b) obj2).value;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.value);
                }
            }

            /* JADX INFO: renamed from: buh.a$a$a$c */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004¨\u0006\f"}, d2 = {"Lbuh/a$a$a$c;", "Lbuh/a$a$a;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getValue", "value", "b", "getCountryCode", "countryCode", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class c extends AbstractC0125a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                @lg.b("city")
                @NotNull
                private final String value;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                @lg.b("countryCode")
                @NotNull
                private final String countryCode;

                public c(String value, String countryCode) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                    this.value = value;
                    this.countryCode = countryCode;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof c)) {
                        return false;
                    }
                    c cVar = (c) obj2;
                    return Intrinsics.f(this.value, cVar.value) && Intrinsics.f(this.countryCode, cVar.countryCode);
                }

                public final int hashCode() {
                    return this.countryCode.hashCode() + (this.value.hashCode() * 31);
                }
            }

            /* JADX INFO: renamed from: buh.a$a$a$d */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004¨\u0006\t"}, d2 = {"Lbuh/a$a$a$d;", "Lbuh/a$a$a;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getValue", "value", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class d extends AbstractC0125a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                @lg.b("checkId")
                @NotNull
                private final String value;

                public d(String value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.value = value;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof d) && Intrinsics.f(this.value, ((d) obj2).value);
                }

                public final int hashCode() {
                    return this.value.hashCode();
                }
            }

            /* JADX INFO: renamed from: buh.a$a$a$e */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0005¨\u0006\u000f"}, d2 = {"Lbuh/a$a$a$e;", "Lbuh/a$a$a;", "Lbuh/a$a$a$e$a;", "", "toString", "()Ljava/lang/String;", "a", "Lbuh/a$a$a$e$a;", "getValue", "()Lbuh/a$a$a$e$a;", "value", "b", "Ljava/lang/String;", "getFrequency", "frequency", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class e extends AbstractC0125a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                @lg.b("money")
                @NotNull
                private final C0127a value;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                @lg.b("frequency")
                private final String frequency;

                /* JADX INFO: renamed from: buh.a$a$a$e$a, reason: collision with other inner class name */
                @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004¨\u0006\u000f"}, d2 = {"Lbuh/a$a$a$e$a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "J", "getAmount", "()J", "amount", "b", "Ljava/lang/String;", "getCurrency", "currency", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final /* data */ class C0127a {

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                    @lg.b("amount")
                    private final long amount;

                    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                    @lg.b("currency")
                    @NotNull
                    private final String currency;

                    public C0127a(long j2, String currency) {
                        Intrinsics.checkNotNullParameter(currency, "currency");
                        this.amount = j2;
                        this.currency = currency;
                    }

                    public final boolean equals(Object obj2) {
                        if (this == obj2) {
                            return true;
                        }
                        if (!(obj2 instanceof C0127a)) {
                            return false;
                        }
                        C0127a c0127a = (C0127a) obj2;
                        return this.amount == c0127a.amount && Intrinsics.f(this.currency, c0127a.currency);
                    }

                    public final int hashCode() {
                        return this.currency.hashCode() + (Long.hashCode(this.amount) * 31);
                    }
                }

                public e(C0127a value, String str) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.value = value;
                    this.frequency = str;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof e)) {
                        return false;
                    }
                    e eVar = (e) obj2;
                    return Intrinsics.f(this.value, eVar.value) && Intrinsics.f(this.frequency, eVar.frequency);
                }

                public final int hashCode() {
                    int iHashCode = this.value.hashCode() * 31;
                    String str = this.frequency;
                    return iHashCode + (str == null ? 0 : str.hashCode());
                }
            }

            /* JADX INFO: renamed from: buh.a$a$a$f */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\u0007J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lbuh/a$a$a$f;", "Lbuh/a$a$a;", "", "Lbuh/a$a$a$f$a;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/util/List;", "getValue", "()Ljava/util/List;", "value", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class f extends AbstractC0125a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                @lg.b("texts")
                @NotNull
                private final List<C0128a> value;

                /* JADX INFO: renamed from: buh.a$a$a$f$a, reason: collision with other inner class name */
                @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004¨\u0006\f"}, d2 = {"Lbuh/a$a$a$f$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getId", "id", "b", "getValue", "value", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final /* data */ class C0128a {

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                    @lg.b("id")
                    @NotNull
                    private final String id;

                    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                    @lg.b("value")
                    @NotNull
                    private final String value;

                    public C0128a(String id10, String value) {
                        Intrinsics.checkNotNullParameter(id10, "id");
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.id = id10;
                        this.value = value;
                    }

                    public final boolean equals(Object obj2) {
                        if (this == obj2) {
                            return true;
                        }
                        if (!(obj2 instanceof C0128a)) {
                            return false;
                        }
                        C0128a c0128a = (C0128a) obj2;
                        return Intrinsics.f(this.id, c0128a.id) && Intrinsics.f(this.value, c0128a.value);
                    }

                    public final int hashCode() {
                        return this.value.hashCode() + (this.id.hashCode() * 31);
                    }
                }

                public f(ArrayList value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.value = value;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof f) && Intrinsics.f(this.value, ((f) obj2).value);
                }

                public final int hashCode() {
                    return this.value.hashCode();
                }
            }

            /* JADX INFO: renamed from: buh.a$a$a$g */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004¨\u0006\t"}, d2 = {"Lbuh/a$a$a$g;", "Lbuh/a$a$a;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getValue", "value", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class g extends AbstractC0125a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                @lg.b("value")
                @NotNull
                private final String value;

                public g(String value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.value = value;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof g) && Intrinsics.f(this.value, ((g) obj2).value);
                }

                public final int hashCode() {
                    return this.value.hashCode();
                }
            }

            /* JADX INFO: renamed from: buh.a$a$a$h */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\u0007J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lbuh/a$a$a$h;", "Lbuh/a$a$a;", "", "Lbuh/a$a$a$h$a;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/util/List;", "getValue", "()Ljava/util/List;", "value", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class h extends AbstractC0125a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                @lg.b("items")
                @NotNull
                private final List<C0129a> value;

                /* JADX INFO: renamed from: buh.a$a$a$h$a, reason: collision with other inner class name */
                @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\r¨\u0006\u0012"}, d2 = {"Lbuh/a$a$a$h$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getValue", "value", "", "b", "J", "getStartDate", "()J", "startDate", "c", "getEndDate", "endDate", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final /* data */ class C0129a {

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                    @lg.b("value")
                    @NotNull
                    private final String value;

                    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                    @lg.b("startDate")
                    private final long startDate;

                    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                    @lg.b("endDate")
                    private final long endDate;

                    public C0129a(String value, long j2, long j3) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.value = value;
                        this.startDate = j2;
                        this.endDate = j3;
                    }

                    public final boolean equals(Object obj2) {
                        if (this == obj2) {
                            return true;
                        }
                        if (!(obj2 instanceof C0129a)) {
                            return false;
                        }
                        C0129a c0129a = (C0129a) obj2;
                        return Intrinsics.f(this.value, c0129a.value) && this.startDate == c0129a.startDate && this.endDate == c0129a.endDate;
                    }

                    public final int hashCode() {
                        return Long.hashCode(this.endDate) + a0.d.c(this.value.hashCode() * 31, 31, this.startDate);
                    }
                }

                public h(ArrayList value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.value = value;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof h) && Intrinsics.f(this.value, ((h) obj2).value);
                }

                public final int hashCode() {
                    return this.value.hashCode();
                }
            }

            private AbstractC0125a() {
            }
        }

        /* JADX INFO: renamed from: buh.a$a$b */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004¨\u0006\u0012"}, d2 = {"Lbuh/a$a$b;", "Lbuh/a$a;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getQuestionId", "questionId", "Lbuh/a$a$a$c;", "b", "Lbuh/a$a$a$c;", "getAnswer", "()Lbuh/a$a$a$c;", "answer", "c", "getType", "type", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b extends AbstractC0124a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("id")
            @NotNull
            private final String questionId;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("answer")
            @NotNull
            private final AbstractC0125a.c answer;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("type")
            @NotNull
            private final String type;

            public b(String questionId, String city, wi0.b countryCode) {
                Intrinsics.checkNotNullParameter(questionId, "questionId");
                Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                Intrinsics.checkNotNullParameter(city, "city");
                AbstractC0125a.c answer = new AbstractC0125a.c(city, countryCode.f297794a);
                Intrinsics.checkNotNullParameter(questionId, "questionId");
                Intrinsics.checkNotNullParameter(answer, "answer");
                Intrinsics.checkNotNullParameter("CITY", "type");
                this.questionId = questionId;
                this.answer = answer;
                this.type = "CITY";
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof b)) {
                    return false;
                }
                b bVar = (b) obj2;
                return Intrinsics.f(this.questionId, bVar.questionId) && Intrinsics.f(this.answer, bVar.answer) && Intrinsics.f(this.type, bVar.type);
            }

            public final int hashCode() {
                return this.type.hashCode() + ((this.answer.hashCode() + (this.questionId.hashCode() * 31)) * 31);
            }
        }

        /* JADX INFO: renamed from: buh.a$a$c */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004¨\u0006\u0012"}, d2 = {"Lbuh/a$a$c;", "Lbuh/a$a;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getQuestionId", "questionId", "Lbuh/a$a$a$d;", "b", "Lbuh/a$a$a$d;", "getAnswer", "()Lbuh/a$a$a$d;", "answer", "c", "getType", "type", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class c extends AbstractC0124a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("id")
            @NotNull
            private final String questionId;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("answer")
            @NotNull
            private final AbstractC0125a.d answer;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("type")
            @NotNull
            private final String type;

            public c(String questionId, String checkId) {
                Intrinsics.checkNotNullParameter(questionId, "questionId");
                Intrinsics.checkNotNullParameter(checkId, "checkId");
                AbstractC0125a.d answer = new AbstractC0125a.d(checkId);
                Intrinsics.checkNotNullParameter(questionId, "questionId");
                Intrinsics.checkNotNullParameter(answer, "answer");
                Intrinsics.checkNotNullParameter("DOCUMENT_UPLOAD", "type");
                this.questionId = questionId;
                this.answer = answer;
                this.type = "DOCUMENT_UPLOAD";
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof c)) {
                    return false;
                }
                c cVar = (c) obj2;
                return Intrinsics.f(this.questionId, cVar.questionId) && Intrinsics.f(this.answer, cVar.answer) && Intrinsics.f(this.type, cVar.type);
            }

            public final int hashCode() {
                return this.type.hashCode() + ((this.answer.hashCode() + (this.questionId.hashCode() * 31)) * 31);
            }
        }

        /* JADX INFO: renamed from: buh.a$a$d */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004¨\u0006\u0012"}, d2 = {"Lbuh/a$a$d;", "Lbuh/a$a;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getQuestionId", "questionId", "Lbuh/a$a$a$e;", "b", "Lbuh/a$a$a$e;", "getAnswer", "()Lbuh/a$a$a$e;", "answer", "c", "getType", "type", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class d extends AbstractC0124a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("id")
            @NotNull
            private final String questionId;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("answer")
            @NotNull
            private final AbstractC0125a.e answer;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("type")
            @NotNull
            private final String type;

            public d(dj0.d money, String questionId, String str) {
                Intrinsics.checkNotNullParameter(questionId, "questionId");
                Intrinsics.checkNotNullParameter(money, "money");
                AbstractC0125a.e answer = new AbstractC0125a.e(new AbstractC0125a.e.C0127a(money.f115082a, money.f115083b.f306286a), str);
                Intrinsics.checkNotNullParameter(questionId, "questionId");
                Intrinsics.checkNotNullParameter(answer, "answer");
                Intrinsics.checkNotNullParameter("MONETARY_VALUE_WITH_FREQUENCY", "type");
                this.questionId = questionId;
                this.answer = answer;
                this.type = "MONETARY_VALUE_WITH_FREQUENCY";
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof d)) {
                    return false;
                }
                d dVar = (d) obj2;
                return Intrinsics.f(this.questionId, dVar.questionId) && Intrinsics.f(this.answer, dVar.answer) && Intrinsics.f(this.type, dVar.type);
            }

            public final int hashCode() {
                return this.type.hashCode() + ((this.answer.hashCode() + (this.questionId.hashCode() * 31)) * 31);
            }
        }

        /* JADX INFO: renamed from: buh.a$a$e */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004¨\u0006\u0012"}, d2 = {"Lbuh/a$a$e;", "Lbuh/a$a;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getQuestionId", "questionId", "Lbuh/a$a$a$a;", "b", "Lbuh/a$a$a$a;", "getAnswer", "()Lbuh/a$a$a$a;", "answer", "c", "getType", "type", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class e extends AbstractC0124a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("id")
            @NotNull
            private final String questionId;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("answer")
            @NotNull
            private final AbstractC0125a.C0126a answer;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("type")
            @NotNull
            private final String type;

            public e(String questionId, List value) {
                Intrinsics.checkNotNullParameter(questionId, "questionId");
                Intrinsics.checkNotNullParameter(value, "value");
                AbstractC0125a.C0126a answer = new AbstractC0125a.C0126a(value);
                Intrinsics.checkNotNullParameter(questionId, "questionId");
                Intrinsics.checkNotNullParameter(answer, "answer");
                Intrinsics.checkNotNullParameter("MULTI_CHOICE", "type");
                this.questionId = questionId;
                this.answer = answer;
                this.type = "MULTI_CHOICE";
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof e)) {
                    return false;
                }
                e eVar = (e) obj2;
                return Intrinsics.f(this.questionId, eVar.questionId) && Intrinsics.f(this.answer, eVar.answer) && Intrinsics.f(this.type, eVar.type);
            }

            public final int hashCode() {
                return this.type.hashCode() + ((this.answer.hashCode() + (this.questionId.hashCode() * 31)) * 31);
            }
        }

        /* JADX INFO: renamed from: buh.a$a$f */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004¨\u0006\u0012"}, d2 = {"Lbuh/a$a$f;", "Lbuh/a$a;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getQuestionId", "questionId", "Lbuh/a$a$a$f;", "b", "Lbuh/a$a$a$f;", "getAnswer", "()Lbuh/a$a$a$f;", "answer", "c", "getType", "type", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class f extends AbstractC0124a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("id")
            @NotNull
            private final String questionId;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("answer")
            @NotNull
            private final AbstractC0125a.f answer;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("type")
            @NotNull
            private final String type;

            public f(String questionId, ArrayList items) {
                Intrinsics.checkNotNullParameter(questionId, "questionId");
                Intrinsics.checkNotNullParameter(items, "items");
                AbstractC0125a.f answer = new AbstractC0125a.f(items);
                Intrinsics.checkNotNullParameter(questionId, "questionId");
                Intrinsics.checkNotNullParameter(answer, "answer");
                Intrinsics.checkNotNullParameter("MULTI_TEXT", "type");
                this.questionId = questionId;
                this.answer = answer;
                this.type = "MULTI_TEXT";
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof f)) {
                    return false;
                }
                f fVar = (f) obj2;
                return Intrinsics.f(this.questionId, fVar.questionId) && Intrinsics.f(this.answer, fVar.answer) && Intrinsics.f(this.type, fVar.type);
            }

            public final int hashCode() {
                return this.type.hashCode() + ((this.answer.hashCode() + (this.questionId.hashCode() * 31)) * 31);
            }
        }

        /* JADX INFO: renamed from: buh.a$a$g */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004¨\u0006\u0012"}, d2 = {"Lbuh/a$a$g;", "Lbuh/a$a;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getQuestionId", "questionId", "Lbuh/a$a$a$g;", "b", "Lbuh/a$a$a$g;", "getAnswer", "()Lbuh/a$a$a$g;", "answer", "c", "getType", "type", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class g extends AbstractC0124a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("id")
            @NotNull
            private final String questionId;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("answer")
            @NotNull
            private final AbstractC0125a.g answer;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("type")
            @NotNull
            private final String type;

            public g(String questionId, String value) {
                Intrinsics.checkNotNullParameter(questionId, "questionId");
                Intrinsics.checkNotNullParameter(value, "value");
                AbstractC0125a.g answer = new AbstractC0125a.g(value);
                Intrinsics.checkNotNullParameter(questionId, "questionId");
                Intrinsics.checkNotNullParameter(answer, "answer");
                Intrinsics.checkNotNullParameter("SINGLE_CHOICE", "type");
                this.questionId = questionId;
                this.answer = answer;
                this.type = "SINGLE_CHOICE";
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof g)) {
                    return false;
                }
                g gVar = (g) obj2;
                return Intrinsics.f(this.questionId, gVar.questionId) && Intrinsics.f(this.answer, gVar.answer) && Intrinsics.f(this.type, gVar.type);
            }

            public final int hashCode() {
                return this.type.hashCode() + ((this.answer.hashCode() + (this.questionId.hashCode() * 31)) * 31);
            }
        }

        /* JADX INFO: renamed from: buh.a$a$h */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004¨\u0006\u0012"}, d2 = {"Lbuh/a$a$h;", "Lbuh/a$a;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getQuestionId", "questionId", "Lbuh/a$a$a$g;", "b", "Lbuh/a$a$a$g;", "getAnswer", "()Lbuh/a$a$a$g;", "answer", "c", "getType", "type", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class h extends AbstractC0124a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("id")
            @NotNull
            private final String questionId;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("answer")
            @NotNull
            private final AbstractC0125a.g answer;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("type")
            @NotNull
            private final String type;

            public h(String questionId, String value) {
                Intrinsics.checkNotNullParameter(questionId, "questionId");
                Intrinsics.checkNotNullParameter(value, "value");
                AbstractC0125a.g answer = new AbstractC0125a.g(value);
                Intrinsics.checkNotNullParameter(questionId, "questionId");
                Intrinsics.checkNotNullParameter(answer, "answer");
                Intrinsics.checkNotNullParameter("TEXT", "type");
                this.questionId = questionId;
                this.answer = answer;
                this.type = "TEXT";
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof h)) {
                    return false;
                }
                h hVar = (h) obj2;
                return Intrinsics.f(this.questionId, hVar.questionId) && Intrinsics.f(this.answer, hVar.answer) && Intrinsics.f(this.type, hVar.type);
            }

            public final int hashCode() {
                return this.type.hashCode() + ((this.answer.hashCode() + (this.questionId.hashCode() * 31)) * 31);
            }
        }

        /* JADX INFO: renamed from: buh.a$a$i */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004¨\u0006\u0012"}, d2 = {"Lbuh/a$a$i;", "Lbuh/a$a;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getQuestionId", "questionId", "Lbuh/a$a$a$h;", "b", "Lbuh/a$a$a$h;", "getAnswer", "()Lbuh/a$a$a$h;", "answer", "c", "getType", "type", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class i extends AbstractC0124a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("id")
            @NotNull
            private final String questionId;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("answer")
            @NotNull
            private final AbstractC0125a.h answer;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("type")
            @NotNull
            private final String type;

            public i(String questionId, ArrayList items) {
                Intrinsics.checkNotNullParameter(questionId, "questionId");
                Intrinsics.checkNotNullParameter(items, "items");
                AbstractC0125a.h answer = new AbstractC0125a.h(items);
                Intrinsics.checkNotNullParameter(questionId, "questionId");
                Intrinsics.checkNotNullParameter(answer, "answer");
                Intrinsics.checkNotNullParameter("TIMELINE", "type");
                this.questionId = questionId;
                this.answer = answer;
                this.type = "TIMELINE";
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof i)) {
                    return false;
                }
                i iVar = (i) obj2;
                return Intrinsics.f(this.questionId, iVar.questionId) && Intrinsics.f(this.answer, iVar.answer) && Intrinsics.f(this.type, iVar.type);
            }

            public final int hashCode() {
                return this.type.hashCode() + ((this.answer.hashCode() + (this.questionId.hashCode() * 31)) * 31);
            }
        }

        /* JADX INFO: renamed from: buh.a$a$j */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004¨\u0006\u0012"}, d2 = {"Lbuh/a$a$j;", "Lbuh/a$a;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getQuestionId", "questionId", "Lbuh/a$a$a$b;", "b", "Lbuh/a$a$a$b;", "getAnswer", "()Lbuh/a$a$a$b;", "answer", "c", "getType", "type", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class j extends AbstractC0124a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("id")
            @NotNull
            private final String questionId;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("answer")
            @NotNull
            private final AbstractC0125a.b answer;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("type")
            @NotNull
            private final String type;

            public j(String questionId, boolean z) {
                Intrinsics.checkNotNullParameter(questionId, "questionId");
                AbstractC0125a.b answer = new AbstractC0125a.b(z);
                Intrinsics.checkNotNullParameter(questionId, "questionId");
                Intrinsics.checkNotNullParameter(answer, "answer");
                Intrinsics.checkNotNullParameter("YES_NO", "type");
                this.questionId = questionId;
                this.answer = answer;
                this.type = "YES_NO";
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof j)) {
                    return false;
                }
                j jVar = (j) obj2;
                return Intrinsics.f(this.questionId, jVar.questionId) && Intrinsics.f(this.answer, jVar.answer) && Intrinsics.f(this.type, jVar.type);
            }

            public final int hashCode() {
                return this.type.hashCode() + ((this.answer.hashCode() + (this.questionId.hashCode() * 31)) * 31);
            }
        }

        private AbstractC0124a() {
        }
    }

    public a(ArrayList answers) {
        Intrinsics.checkNotNullParameter(answers, "answers");
        this.answers = answers;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.answers, ((a) obj2).answers);
    }

    public final int hashCode() {
        return this.answers.hashCode();
    }
}
