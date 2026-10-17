package nx4;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0005\r\u000b\u0007\u0005\tJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u000b\u0010\u000f¨\u0006\u0011"}, d2 = {"Lnx4/w1;", "Lnx4/m0;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "d", "placeholder", "c", "helperText", "Lnx4/x1;", "Lnx4/x1;", "()Lnx4/x1;", "inputDetails", "feature_credit_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class w1 implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("placeholder")
    private final String placeholder;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("helperText")
    private final String helperText;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("inputDetails")
    @NotNull
    private final x1 inputDetails;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\n"}, d2 = {"Lnx4/w1$a;", "Lnx4/x1;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "value", "format", "feature_credit_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a implements x1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("value")
        private final String value;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("format")
        @NotNull
        private final String format;

        public a(String str, String format) {
            Intrinsics.checkNotNullParameter(format, "format");
            this.value = str;
            this.format = format;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFormat() {
            return this.format;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
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
            return Intrinsics.f(this.value, aVar.value) && Intrinsics.f(this.format, aVar.format);
        }

        public final int hashCode() {
            String str = this.value;
            return this.format.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004¨\u0006\u000e"}, d2 = {"Lnx4/w1$b;", "Lnx4/x1;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "value", "b", "c", "regex", "mask", "proposedValue", "feature_credit_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b implements x1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("value")
        private final String value;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("regex")
        @NotNull
        private final String regex;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("mask")
        private final String mask;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("proposedValue")
        private final String proposedValue;

        public b(String str, String regex, String str2, String str3) {
            Intrinsics.checkNotNullParameter(regex, "regex");
            this.value = str;
            this.regex = regex;
            this.mask = str2;
            this.proposedValue = str3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getMask() {
            return this.mask;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getProposedValue() {
            return this.proposedValue;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getRegex() {
            return this.regex;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.value, bVar.value) && Intrinsics.f(this.regex, bVar.regex) && Intrinsics.f(this.mask, bVar.mask) && Intrinsics.f(this.proposedValue, bVar.proposedValue);
        }

        public final int hashCode() {
            String str = this.value;
            int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.regex);
            String str2 = this.mask;
            int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.proposedValue;
            return iHashCode + (str3 != null ? str3.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0003\r\u0007\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0005\u0010\u000b¨\u0006\u000e"}, d2 = {"Lnx4/w1$c;", "Lnx4/x1;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "value", "Lnx4/w1$c$a;", "Lnx4/w1$c$a;", "()Lnx4/w1$c$a;", "details", "c", "feature_credit_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c implements x1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("value")
        private final String value;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("singleSelectorDetails")
        @NotNull
        private final a details;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0005\u0010\rR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u000b\u0010\u0010¨\u0006\u0012"}, d2 = {"Lnx4/w1$c$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "title", "", "Lnx4/w1$c$c;", "b", "Ljava/util/List;", "()Ljava/util/List;", "items", "Lnx4/w1$c$c;", "()Lnx4/w1$c$c;", "otherItem", "feature_credit_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("title")
            @NotNull
            private final String title;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("items")
            @NotNull
            private final List<C1225c> items;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("otherItem")
            private final C1225c otherItem;

            public a(String title, ArrayList items, C1225c c1225c) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(items, "items");
                this.title = title;
                this.items = items;
                this.otherItem = c1225c;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final List getItems() {
                return this.items;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final C1225c getOtherItem() {
                return this.otherItem;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof a)) {
                    return false;
                }
                a aVar = (a) obj2;
                return Intrinsics.f(this.title, aVar.title) && Intrinsics.f(this.items, aVar.items) && Intrinsics.f(this.otherItem, aVar.otherItem);
            }

            public final int hashCode() {
                int iD = p.a.d(this.title.hashCode() * 31, 31, this.items);
                C1225c c1225c = this.otherItem;
                return iD + (c1225c == null ? 0 : c1225c.hashCode());
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\f"}, d2 = {"Lnx4/w1$c$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "title", "b", "description", "buttonTitle", "feature_credit_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("title")
            @NotNull
            private final String title;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("description")
            @NotNull
            private final String description;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("buttonTitle")
            @NotNull
            private final String buttonTitle;

            public b(String title, String description, String buttonTitle) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(description, "description");
                Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
                this.title = title;
                this.description = description;
                this.buttonTitle = buttonTitle;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getButtonTitle() {
                return this.buttonTitle;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof b)) {
                    return false;
                }
                b bVar = (b) obj2;
                return Intrinsics.f(this.title, bVar.title) && Intrinsics.f(this.description, bVar.description) && Intrinsics.f(this.buttonTitle, bVar.buttonTitle);
            }

            public final int hashCode() {
                return this.buttonTitle.hashCode() + p.a.c(this.title.hashCode() * 31, 31, this.description);
            }
        }

        /* JADX INFO: renamed from: nx4.w1$c$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0005\u0010\u0011¨\u0006\u0013"}, d2 = {"Lnx4/w1$c$c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "value", "b", "d", "title", "c", "image", "label", "Lnx4/w1$c$b;", "Lnx4/w1$c$b;", "()Lnx4/w1$c$b;", "explainerBottomSheet", "feature_credit_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C1225c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("value")
            private final String value;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("title")
            @NotNull
            private final String title;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("image")
            private final String image;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @lg.b("label")
            private final String label;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            @lg.b("explainerBottomSheet")
            private final b explainerBottomSheet;

            public C1225c(String str, String title, String str2, String str3, b bVar) {
                Intrinsics.checkNotNullParameter(title, "title");
                this.value = str;
                this.title = title;
                this.image = str2;
                this.label = str3;
                this.explainerBottomSheet = bVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final b getExplainerBottomSheet() {
                return this.explainerBottomSheet;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getImage() {
                return this.image;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getLabel() {
                return this.label;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final String getValue() {
                return this.value;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof C1225c)) {
                    return false;
                }
                C1225c c1225c = (C1225c) obj2;
                return Intrinsics.f(this.value, c1225c.value) && Intrinsics.f(this.title, c1225c.title) && Intrinsics.f(this.image, c1225c.image) && Intrinsics.f(this.label, c1225c.label) && Intrinsics.f(this.explainerBottomSheet, c1225c.explainerBottomSheet);
            }

            public final int hashCode() {
                String str = this.value;
                int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.title);
                String str2 = this.image;
                int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.label;
                int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
                b bVar = this.explainerBottomSheet;
                return iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
            }
        }

        public c(String str, a details) {
            Intrinsics.checkNotNullParameter(details, "details");
            this.value = str;
            this.details = details;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final a getDetails() {
            return this.details;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return Intrinsics.f(this.value, cVar.value) && Intrinsics.f(this.details, cVar.details);
        }

        public final int hashCode() {
            String str = this.value;
            return this.details.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\n"}, d2 = {"Lnx4/w1$d;", "Lnx4/x1;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "value", "regex", "feature_credit_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class d implements x1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("value")
        private final String value;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("regex")
        @NotNull
        private final String regex;

        public d(String str, String regex) {
            Intrinsics.checkNotNullParameter(regex, "regex");
            this.value = str;
            this.regex = regex;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getRegex() {
            return this.regex;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof d)) {
                return false;
            }
            d dVar = (d) obj2;
            return Intrinsics.f(this.value, dVar.value) && Intrinsics.f(this.regex, dVar.regex);
        }

        public final int hashCode() {
            String str = this.value;
            return this.regex.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }
    }

    public w1(String id10, String str, String str2, x1 inputDetails) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(inputDetails, "inputDetails");
        this.id = id10;
        this.placeholder = str;
        this.helperText = str2;
        this.inputDetails = inputDetails;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getHelperText() {
        return this.helperText;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final x1 getInputDetails() {
        return this.inputDetails;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj2;
        return Intrinsics.f(this.id, w1Var.id) && Intrinsics.f(this.placeholder, w1Var.placeholder) && Intrinsics.f(this.helperText, w1Var.helperText) && Intrinsics.f(this.inputDetails, w1Var.inputDetails);
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.placeholder;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.helperText;
        return this.inputDetails.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
