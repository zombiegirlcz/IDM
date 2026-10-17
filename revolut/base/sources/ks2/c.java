package ks2;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.blue_prompt.BluePromptBackgroundType;
import com.revolut.feature.blue_prompt.BluePromptContent;
import koi.j;
import kotlin.jvm.internal.Intrinsics;
import qv0.p;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements j, p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f189096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f189097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f189098c;
    public final Clause d;
    public final BluePromptContent e;
    public final ResourceImage f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f189099g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Clause f189100h;
    public final Clause i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Image f189101j;
    public final Image k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final LargeActionButton.ButtonStyle.DefaultFilledButton f189102l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final LargeActionButton.ButtonStyle f189103m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f189104n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AnalyticsContext f189105p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AnalyticsContext f189106q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final BluePromptBackgroundType f189107r;

    public c(Clause title, Clause description, Clause clause, BluePromptContent content, ResourceImage resourceImage, e eVar, Clause clause2, Clause clause3, Image image, Image image2, LargeActionButton.ButtonStyle buttonStyle, AnalyticsContext analyticsContext, AnalyticsContext analyticsContext2, BluePromptBackgroundType bluePromptBackgroundType, int i) {
        Clause clause4 = (i & 8) != 0 ? null : clause;
        e buttonsStyle = (i & 128) != 0 ? e.VERTICAL : eVar;
        Clause clause5 = (i & 512) != 0 ? null : clause3;
        Image image3 = (i & 1024) != 0 ? null : image;
        Image image4 = (i & 2048) != 0 ? null : image2;
        LargeActionButton.ButtonStyle.DefaultFilledButton primaryActionStyle = LargeActionButton.ButtonStyle.f58725a;
        LargeActionButton.ButtonStyle secondaryActionStyle = (i & 8192) != 0 ? LargeActionButton.ButtonStyle.f58726b : buttonStyle;
        AnalyticsContext analyticsContext3 = (65536 & i) != 0 ? null : analyticsContext;
        AnalyticsContext analyticsContext4 = (131072 & i) != 0 ? null : analyticsContext2;
        BluePromptBackgroundType bluePromptBackgroundType2 = (i & 262144) == 0 ? bluePromptBackgroundType : null;
        Intrinsics.checkNotNullParameter("bluePromptId", "listId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(buttonsStyle, "buttonsStyle");
        Intrinsics.checkNotNullParameter(primaryActionStyle, "primaryActionStyle");
        Intrinsics.checkNotNullParameter(secondaryActionStyle, "secondaryActionStyle");
        this.f189096a = "bluePromptId";
        this.f189097b = title;
        this.f189098c = description;
        this.d = clause4;
        this.e = content;
        this.f = resourceImage;
        this.f189099g = buttonsStyle;
        this.f189100h = clause2;
        this.i = clause5;
        this.f189101j = image3;
        this.k = image4;
        this.f189102l = primaryActionStyle;
        this.f189103m = secondaryActionStyle;
        this.f189104n = true;
        this.o = true;
        this.f189105p = analyticsContext3;
        this.f189106q = analyticsContext4;
        this.f189107r = bluePromptBackgroundType2;
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getO() {
        return null;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF51832a() {
        return this.f189096a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f189096a, cVar.f189096a) && Intrinsics.f(this.f189097b, cVar.f189097b) && Intrinsics.f(this.f189098c, cVar.f189098c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f) && this.f189099g == cVar.f189099g && Intrinsics.f(this.f189100h, cVar.f189100h) && Intrinsics.f(this.i, cVar.i) && Intrinsics.f(this.f189101j, cVar.f189101j) && Intrinsics.f(this.k, cVar.k) && Intrinsics.f(this.f189102l, cVar.f189102l) && Intrinsics.f(this.f189103m, cVar.f189103m) && this.f189104n == cVar.f189104n && this.o == cVar.o && Intrinsics.f(this.f189105p, cVar.f189105p) && Intrinsics.f(this.f189106q, cVar.f189106q) && Intrinsics.f(this.f189107r, cVar.f189107r);
    }

    public final int hashCode() {
        int iA = p.a.a(p.a.a(this.f189096a.hashCode() * 31, 31, this.f189097b), 31, this.f189098c);
        Clause clause = this.d;
        int iHashCode = (this.e.hashCode() + ((iA + (clause == null ? 0 : clause.hashCode())) * 961)) * 31;
        ResourceImage resourceImage = this.f;
        int iHashCode2 = (this.f189099g.hashCode() + ((iHashCode + (resourceImage == null ? 0 : resourceImage.hashCode())) * 31)) * 31;
        Clause clause2 = this.f189100h;
        int iHashCode3 = (iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        Clause clause3 = this.i;
        int iHashCode4 = (iHashCode3 + (clause3 == null ? 0 : clause3.hashCode())) * 31;
        Image image = this.f189101j;
        int iHashCode5 = (iHashCode4 + (image == null ? 0 : image.hashCode())) * 31;
        Image image2 = this.k;
        int iC = j6.a.c(j6.a.c(r6.b.d(this.f189103m, (this.f189102l.hashCode() + ((iHashCode5 + (image2 == null ? 0 : image2.hashCode())) * 31)) * 31, 31), 31, this.f189104n), 31, this.o);
        AnalyticsContext analyticsContext = this.f189105p;
        int iA2 = (iC + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a))) * 31;
        AnalyticsContext analyticsContext2 = this.f189106q;
        int iA3 = (iA2 + (analyticsContext2 == null ? 0 : AnalyticsContext.a(analyticsContext2.f50296a))) * 31;
        BluePromptBackgroundType bluePromptBackgroundType = this.f189107r;
        return (iA3 + (bluePromptBackgroundType != null ? bluePromptBackgroundType.hashCode() : 0)) * 31;
    }
}
