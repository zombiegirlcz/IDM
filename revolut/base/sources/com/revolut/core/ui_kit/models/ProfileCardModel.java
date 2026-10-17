package com.revolut.core.ui_kit.models;

import android.os.Parcelable;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/revolut/core/ui_kit/models/ProfileCardModel;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Loaded", "Loading", "Error", "CircleActionButtonModel", "Lcom/revolut/core/ui_kit/models/ProfileCardModel$Error;", "Lcom/revolut/core/ui_kit/models/ProfileCardModel$Loaded;", "Lcom/revolut/core/ui_kit/models/ProfileCardModel$Loading;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ProfileCardModel extends TrackableItem {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/models/ProfileCardModel$CircleActionButtonModel;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CircleActionButtonModel implements qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f57917a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextLocalisedClause f57918b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ResourceImage f57919c;
        public final svi.r d;
        public Parcelable e;

        public CircleActionButtonModel(String listId, TextLocalisedClause text, ResourceImage resourceImage, svi.r rVar) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(text, "text");
            this.f57917a = listId;
            this.f57918b = text;
            this.f57919c = resourceImage;
            this.d = rVar;
            this.e = null;
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a */
        public final Object getI() {
            return this.d;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CircleActionButtonModel)) {
                return false;
            }
            CircleActionButtonModel circleActionButtonModel = (CircleActionButtonModel) obj2;
            return this.f57917a.equals(circleActionButtonModel.f57917a) && this.f57918b.equals(circleActionButtonModel.f57918b) && this.f57919c.equals(circleActionButtonModel.f57919c) && this.d.equals(circleActionButtonModel.d) && Intrinsics.f(this.e, circleActionButtonModel.e);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getD() {
            return this.e;
        }

        public final int hashCode() {
            int iHashCode = (this.d.hashCode() + j6.a.c(org.bouncycastle.jcajce.provider.digest.a.b(this.f57919c, t61.a.a(this.f57917a.hashCode() * 31, 31, this.f57918b), 961), 31, true)) * 31;
            Parcelable parcelable = this.e;
            return iHashCode + (parcelable == null ? 0 : parcelable.hashCode());
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.e = parcelable;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/models/ProfileCardModel$Error;", "Lcom/revolut/core/ui_kit/models/ProfileCardModel;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Error implements ProfileCardModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextLocalisedClause f57920a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f57921b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a0 f57922c;
        public Parcelable d;

        public Error(TextLocalisedClause title, Clause subtitle, a0 errorButton) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            o image = o.f58117a;
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(errorButton, "errorButton");
            this.f57920a = title;
            this.f57921b = subtitle;
            this.f57922c = errorButton;
            this.d = null;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Error)) {
                return false;
            }
            Error error = (Error) obj2;
            if (!this.f57920a.equals(error.f57920a) || !this.f57921b.equals(error.f57921b)) {
                return false;
            }
            Object obj3 = o.f58117a;
            return obj3.equals(obj3) && this.f57922c.equals(error.f57922c) && Intrinsics.f(this.d, error.d);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getD() {
            return this.d;
        }

        public final int hashCode() {
            int iHashCode = (this.f57922c.hashCode() + ((o.f58117a.hashCode() + p.a.b(this.f57920a.hashCode() * 31, 31, this.f57921b)) * 31)) * 961;
            Parcelable parcelable = this.d;
            return iHashCode + (parcelable == null ? 0 : parcelable.hashCode());
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.d = parcelable;
        }

        @Override // com.revolut.core.ui_kit.models.ProfileCardModel
        /* JADX INFO: renamed from: w1 */
        public final AnimatedBackgroundType getE() {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001:\u0004\u0005\u0006\u0007\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/models/ProfileCardModel$Loaded;", "Lcom/revolut/core/ui_kit/models/ProfileCardModel;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/models/t", "com/revolut/core/ui_kit/models/w", "com/revolut/core/ui_kit/models/c0", "com/revolut/core/ui_kit/models/i0", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Loaded implements ProfileCardModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Image f57923a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i0 f57924b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final t f57925c;
        public final c0 d;
        public final AnimatedBackgroundType e;
        public Parcelable f;

        public Loaded(UrlImage urlImage, i0 image, t content, c0 c0Var, AnimatedBackgroundType animatedBackgroundType, int i) {
            urlImage = (i & 1) != 0 ? null : urlImage;
            c0Var = (i & 8) != 0 ? null : c0Var;
            animatedBackgroundType = (i & 32) != 0 ? null : animatedBackgroundType;
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(content, "content");
            this.f57923a = urlImage;
            this.f57924b = image;
            this.f57925c = content;
            this.d = c0Var;
            this.e = animatedBackgroundType;
            this.f = null;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj2;
            return Intrinsics.f(this.f57923a, loaded.f57923a) && Intrinsics.f(this.f57924b, loaded.f57924b) && Intrinsics.f(this.f57925c, loaded.f57925c) && Intrinsics.f(this.d, loaded.d) && Intrinsics.f(this.e, loaded.e) && Intrinsics.f(this.f, loaded.f);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getD() {
            return this.f;
        }

        public final int hashCode() {
            Image image = this.f57923a;
            int iHashCode = (this.f57925c.hashCode() + ((this.f57924b.hashCode() + ((image == null ? 0 : image.hashCode()) * 31)) * 31)) * 31;
            c0 c0Var = this.d;
            int iHashCode2 = (iHashCode + (c0Var == null ? 0 : c0Var.hashCode())) * 961;
            AnimatedBackgroundType animatedBackgroundType = this.e;
            int iHashCode3 = (iHashCode2 + (animatedBackgroundType == null ? 0 : animatedBackgroundType.hashCode())) * 31;
            Parcelable parcelable = this.f;
            return iHashCode3 + (parcelable != null ? parcelable.hashCode() : 0);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f = parcelable;
        }

        @Override // com.revolut.core.ui_kit.models.ProfileCardModel
        /* JADX INFO: renamed from: w1, reason: from getter */
        public final AnimatedBackgroundType getE() {
            return this.e;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/models/ProfileCardModel$Loading;", "Lcom/revolut/core/ui_kit/models/ProfileCardModel;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Loading implements ProfileCardModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Parcelable f57926a;

        public Loading() {
            this(0);
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Loading) && Intrinsics.f(this.f57926a, ((Loading) obj2).f57926a);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getD() {
            return this.f57926a;
        }

        public final int hashCode() {
            Parcelable parcelable = this.f57926a;
            if (parcelable == null) {
                return 0;
            }
            return parcelable.hashCode();
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f57926a = parcelable;
        }

        @Override // com.revolut.core.ui_kit.models.ProfileCardModel
        /* JADX INFO: renamed from: w1 */
        public final AnimatedBackgroundType getE() {
            return null;
        }

        public Loading(int i) {
            this.f57926a = null;
        }
    }

    /* JADX INFO: renamed from: w1 */
    AnimatedBackgroundType getE();
}
