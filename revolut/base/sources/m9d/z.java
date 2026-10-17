package m9d;

import com.revolut.chat.domain.model.ChatMode;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class z implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f203752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f203753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f203754c;
    public final Data d;
    public final Data e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f203755g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Data f203756h;
    public final Data i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Data f203757j;
    public final Data k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f203758l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f203759m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Data f203760n;
    public final ChatMode o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Data f203761p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Data f203762q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f203763r;

    public z(Data incidents, Data quickActions, Data ticketsWidgetState, Data myRequestsButtonState, Data kycBanner, Data callRequests, Data background, Data titleData, Data troubleshooterWidget, Data categories, Data suggestedArticles, boolean z, boolean z3, Data hasPhoneSupport, ChatMode chatMode, Data pricingPlan, Data feeds, boolean z4) {
        Intrinsics.checkNotNullParameter(incidents, "incidents");
        Intrinsics.checkNotNullParameter(quickActions, "quickActions");
        Intrinsics.checkNotNullParameter(ticketsWidgetState, "ticketsWidgetState");
        Intrinsics.checkNotNullParameter(myRequestsButtonState, "myRequestsButtonState");
        Intrinsics.checkNotNullParameter(kycBanner, "kycBanner");
        Intrinsics.checkNotNullParameter(callRequests, "callRequests");
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(titleData, "titleData");
        Intrinsics.checkNotNullParameter(troubleshooterWidget, "troubleshooterWidget");
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(suggestedArticles, "suggestedArticles");
        Intrinsics.checkNotNullParameter(hasPhoneSupport, "hasPhoneSupport");
        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
        Intrinsics.checkNotNullParameter(feeds, "feeds");
        this.f203752a = incidents;
        this.f203753b = quickActions;
        this.f203754c = ticketsWidgetState;
        this.d = myRequestsButtonState;
        this.e = kycBanner;
        this.f = callRequests;
        this.f203755g = background;
        this.f203756h = titleData;
        this.i = troubleshooterWidget;
        this.f203757j = categories;
        this.k = suggestedArticles;
        this.f203758l = z;
        this.f203759m = z3;
        this.f203760n = hasPhoneSupport;
        this.o = chatMode;
        this.f203761p = pricingPlan;
        this.f203762q = feeds;
        this.f203763r = z4;
    }

    public static z a(z zVar, Data data, Data data2, Data data3, Data data4, Data data5, Data data6, Data data7, Data data8, Data data9, Data data10, Data data11, boolean z, boolean z3, Data data12, Data data13, Data data14, boolean z4, int i) {
        Data incidents = (i & 1) != 0 ? zVar.f203752a : data;
        Data quickActions = (i & 2) != 0 ? zVar.f203753b : data2;
        Data ticketsWidgetState = (i & 4) != 0 ? zVar.f203754c : data3;
        Data myRequestsButtonState = (i & 8) != 0 ? zVar.d : data4;
        Data kycBanner = (i & 16) != 0 ? zVar.e : data5;
        Data callRequests = (i & 32) != 0 ? zVar.f : data6;
        Data background = (i & 64) != 0 ? zVar.f203755g : data7;
        Data titleData = (i & 128) != 0 ? zVar.f203756h : data8;
        Data troubleshooterWidget = (i & 256) != 0 ? zVar.i : data9;
        Data categories = (i & 512) != 0 ? zVar.f203757j : data10;
        Data suggestedArticles = (i & 1024) != 0 ? zVar.k : data11;
        boolean z6 = (i & 2048) != 0 ? zVar.f203758l : z;
        boolean z11 = (i & 4096) != 0 ? zVar.f203759m : z3;
        Data hasPhoneSupport = (i & 8192) != 0 ? zVar.f203760n : data12;
        boolean z12 = z6;
        ChatMode chatMode = (i & 16384) != 0 ? zVar.o : ChatMode.SingleFeed.f51045a;
        Data pricingPlan = (i & 32768) != 0 ? zVar.f203761p : data13;
        ChatMode chatMode2 = chatMode;
        Data feeds = (i & 65536) != 0 ? zVar.f203762q : data14;
        boolean z29 = z11;
        boolean z31 = (i & 131072) != 0 ? zVar.f203763r : z4;
        zVar.getClass();
        Intrinsics.checkNotNullParameter(incidents, "incidents");
        Intrinsics.checkNotNullParameter(quickActions, "quickActions");
        Intrinsics.checkNotNullParameter(ticketsWidgetState, "ticketsWidgetState");
        Intrinsics.checkNotNullParameter(myRequestsButtonState, "myRequestsButtonState");
        Intrinsics.checkNotNullParameter(kycBanner, "kycBanner");
        Intrinsics.checkNotNullParameter(callRequests, "callRequests");
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(titleData, "titleData");
        Intrinsics.checkNotNullParameter(troubleshooterWidget, "troubleshooterWidget");
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(suggestedArticles, "suggestedArticles");
        Intrinsics.checkNotNullParameter(hasPhoneSupport, "hasPhoneSupport");
        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
        Intrinsics.checkNotNullParameter(feeds, "feeds");
        return new z(incidents, quickActions, ticketsWidgetState, myRequestsButtonState, kycBanner, callRequests, background, titleData, troubleshooterWidget, categories, suggestedArticles, z12, z29, hasPhoneSupport, chatMode2, pricingPlan, feeds, z31);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f203752a, zVar.f203752a) && Intrinsics.f(this.f203753b, zVar.f203753b) && Intrinsics.f(this.f203754c, zVar.f203754c) && Intrinsics.f(this.d, zVar.d) && Intrinsics.f(this.e, zVar.e) && Intrinsics.f(this.f, zVar.f) && Intrinsics.f(this.f203755g, zVar.f203755g) && Intrinsics.f(this.f203756h, zVar.f203756h) && Intrinsics.f(this.i, zVar.i) && Intrinsics.f(this.f203757j, zVar.f203757j) && Intrinsics.f(this.k, zVar.k) && this.f203758l == zVar.f203758l && this.f203759m == zVar.f203759m && Intrinsics.f(this.f203760n, zVar.f203760n) && Intrinsics.f(this.o, zVar.o) && Intrinsics.f(this.f203761p, zVar.f203761p) && Intrinsics.f(this.f203762q, zVar.f203762q) && this.f203763r == zVar.f203763r;
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f203760n, j6.a.c(j6.a.c(kii.e.c(this.k, kii.e.c(this.f203757j, kii.e.c(this.i, kii.e.c(this.f203756h, kii.e.c(this.f203755g, kii.e.c(this.f, kii.e.c(this.e, kii.e.c(this.d, kii.e.c(this.f203754c, kii.e.c(this.f203753b, this.f203752a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31, this.f203758l), 31, this.f203759m), 31);
        ChatMode chatMode = this.o;
        return Boolean.hashCode(this.f203763r) + kii.e.c(this.f203762q, kii.e.c(this.f203761p, (iC + (chatMode == null ? 0 : chatMode.hashCode())) * 31, 31), 31);
    }
}
