package o14;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public abstract class d {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\u0004¨\u0006\r"}, d2 = {"Lo14/d$a;", "Lo14/d;", "", "toString", "()Ljava/lang/String;", "Lt14/a;", "a", "Lt14/a;", "()Lt14/a;", "content", "b", "Ljava/lang/String;", "presentationStyle", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("content")
        @NotNull
        private final t14.a content;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("presentationStyle")
        private final String presentationStyle;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final t14.a getContent() {
            return this.content;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getPresentationStyle() {
            return this.presentationStyle;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.content, aVar.content) && Intrinsics.f(this.presentationStyle, aVar.presentationStyle);
        }

        public final int hashCode() {
            int iHashCode = this.content.hashCode() * 31;
            String str = this.presentationStyle;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Lo14/d$b;", "Lo14/d;", "", "toString", "()Ljava/lang/String;", "Lo14/a;", "a", "Lo14/a;", "()Lo14/a;", "content", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("content")
        @NotNull
        private final o14.a content;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final o14.a getContent() {
            return this.content;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && Intrinsics.f(this.content, ((b) obj2).content);
        }

        public final int hashCode() {
            return this.content.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Lo14/d$c;", "Lo14/d;", "", "toString", "()Ljava/lang/String;", "Ln04/a;", "a", "Ln04/a;", "()Ln04/a;", "content", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("content")
        @NotNull
        private final n04.a content;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final n04.a getContent() {
            return this.content;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof c) && Intrinsics.f(this.content, ((c) obj2).content);
        }

        public final int hashCode() {
            return this.content.hashCode();
        }
    }

    /* JADX INFO: renamed from: o14.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Lo14/d$d;", "Lo14/d;", "", "toString", "()Ljava/lang/String;", "Lt14/h;", "a", "Lt14/h;", "()Lt14/h;", "content", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C1230d extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("content")
        @NotNull
        private final t14.h content;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final t14.h getContent() {
            return this.content;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof C1230d) && Intrinsics.f(this.content, ((C1230d) obj2).content);
        }

        public final int hashCode() {
            return this.content.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Lo14/d$e;", "Lo14/d;", "", "toString", "()Ljava/lang/String;", "Lo14/i;", "a", "Lo14/i;", "()Lo14/i;", "content", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class e extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("content")
        @NotNull
        private final i content;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final i getContent() {
            return this.content;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof e) && Intrinsics.f(this.content, ((e) obj2).content);
        }

        public final int hashCode() {
            return this.content.hashCode();
        }
    }

    private d() {
    }
}
