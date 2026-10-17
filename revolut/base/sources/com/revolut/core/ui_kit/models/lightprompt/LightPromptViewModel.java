package com.revolut.core.ui_kit.models.lightprompt;

import android.os.Parcelable;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0003\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/core/ui_kit/models/lightprompt/LightPromptViewModel;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Loading", "Error", "Content", "V1Content", "V2Content", "Lcom/revolut/core/ui_kit/models/lightprompt/LightPromptViewModel$Content;", "Lcom/revolut/core/ui_kit/models/lightprompt/LightPromptViewModel$Error;", "Lcom/revolut/core/ui_kit/models/lightprompt/LightPromptViewModel$Loading;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface LightPromptViewModel extends TrackableItem {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/revolut/core/ui_kit/models/lightprompt/LightPromptViewModel$Content;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Lcom/revolut/core/ui_kit/models/lightprompt/LightPromptViewModel;", "com/revolut/core/ui_kit/models/lightprompt/a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Content extends TrackableItem, LightPromptViewModel {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/models/lightprompt/LightPromptViewModel$Error;", "Lcom/revolut/core/ui_kit/models/lightprompt/LightPromptViewModel;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Error implements LightPromptViewModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ComplexImage.Regular f58092a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextLocalisedClause f58093b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextLocalisedClause f58094c;
        public Parcelable d;

        public Error(ComplexImage.Regular image, TextLocalisedClause title, TextLocalisedClause actionText, Parcelable parcelable) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(actionText, "actionText");
            this.f58092a = image;
            this.f58093b = title;
            this.f58094c = actionText;
            this.d = parcelable;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Error)) {
                return false;
            }
            Error error = (Error) obj2;
            return this.f58092a.equals(error.f58092a) && this.f58093b.equals(error.f58093b) && this.f58094c.equals(error.f58094c) && Intrinsics.f(this.d, error.d);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getU() {
            return this.d;
        }

        public final int hashCode() {
            int iA = t61.a.a(t61.a.a(this.f58092a.f55837a.hashCode() * 31, 31, this.f58093b), 31, this.f58094c);
            Parcelable parcelable = this.d;
            return iA + (parcelable == null ? 0 : parcelable.hashCode());
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.d = parcelable;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/models/lightprompt/LightPromptViewModel$Loading;", "Lcom/revolut/core/ui_kit/models/lightprompt/LightPromptViewModel;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Loading implements LightPromptViewModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Parcelable f58095a;

        public Loading() {
            this(null);
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Loading) && Intrinsics.f(this.f58095a, ((Loading) obj2).f58095a);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getU() {
            return this.f58095a;
        }

        public final int hashCode() {
            Parcelable parcelable = this.f58095a;
            if (parcelable == null) {
                return 0;
            }
            return parcelable.hashCode();
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f58095a = parcelable;
        }

        public Loading(Parcelable parcelable) {
            this.f58095a = parcelable;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/models/lightprompt/LightPromptViewModel$V1Content;", "Lcom/revolut/core/ui_kit/models/lightprompt/LightPromptViewModel$Content;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/models/lightprompt/b", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @yhm.d
    public static final /* data */ class V1Content implements Content {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f58096a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f58097b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f58098c;
        public final TextLocalisedClause d;
        public Parcelable e;

        public V1Content(ArrayList items, a aVar, b bVar, TextLocalisedClause textLocalisedClause, Parcelable parcelable) {
            Intrinsics.checkNotNullParameter(items, "items");
            this.f58096a = items;
            this.f58097b = aVar;
            this.f58098c = bVar;
            this.d = textLocalisedClause;
            this.e = parcelable;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof V1Content)) {
                return false;
            }
            V1Content v1Content = (V1Content) obj2;
            return this.f58096a.equals(v1Content.f58096a) && Intrinsics.f(this.f58097b, v1Content.f58097b) && Intrinsics.f(this.f58098c, v1Content.f58098c) && Intrinsics.f(this.d, v1Content.d) && Intrinsics.f(this.e, v1Content.e);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getU() {
            return this.e;
        }

        public final int hashCode() {
            int iHashCode = this.f58096a.hashCode() * 31;
            a aVar = this.f58097b;
            int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
            b bVar = this.f58098c;
            int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
            TextLocalisedClause textLocalisedClause = this.d;
            int iHashCode4 = (iHashCode3 + (textLocalisedClause == null ? 0 : textLocalisedClause.hashCode())) * 31;
            Parcelable parcelable = this.e;
            return Boolean.hashCode(false) + ((iHashCode4 + (parcelable == null ? 0 : parcelable.hashCode())) * 31);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.e = parcelable;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/models/lightprompt/LightPromptViewModel$V2Content;", "Lcom/revolut/core/ui_kit/models/lightprompt/LightPromptViewModel$Content;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/models/lightprompt/c", "com/revolut/core/ui_kit/models/lightprompt/d", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class V2Content implements Content {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f58099a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f58100b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f58101c;
        public final List d;
        public final d e;
        public final a f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Parcelable f58102g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f58103h;

        public V2Content(c header, ArrayList items, List topDisclaimers, List bottomDisclaimers, d dVar, a aVar, Parcelable parcelable, boolean z) {
            Intrinsics.checkNotNullParameter(header, "header");
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(topDisclaimers, "topDisclaimers");
            Intrinsics.checkNotNullParameter(bottomDisclaimers, "bottomDisclaimers");
            this.f58099a = header;
            this.f58100b = items;
            this.f58101c = topDisclaimers;
            this.d = bottomDisclaimers;
            this.e = dVar;
            this.f = aVar;
            this.f58102g = parcelable;
            this.f58103h = z;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof V2Content)) {
                return false;
            }
            V2Content v2Content = (V2Content) obj2;
            return this.f58099a.equals(v2Content.f58099a) && this.f58100b.equals(v2Content.f58100b) && Intrinsics.f(this.f58101c, v2Content.f58101c) && Intrinsics.f(this.d, v2Content.d) && Intrinsics.f(this.e, v2Content.e) && Intrinsics.f(this.f, v2Content.f) && Intrinsics.f(this.f58102g, v2Content.f58102g) && this.f58103h == v2Content.f58103h;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getU() {
            return this.f58102g;
        }

        public final int hashCode() {
            int iD = p.a.d(p.a.d(com.google.android.gms.internal.mlkit_vision_face.a.b(this.f58100b, this.f58099a.hashCode() * 31, 31), 31, this.f58101c), 31, this.d);
            d dVar = this.e;
            int iHashCode = (iD + (dVar == null ? 0 : dVar.f58113a.hashCode())) * 31;
            a aVar = this.f;
            int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
            Parcelable parcelable = this.f58102g;
            return Boolean.hashCode(this.f58103h) + ((iHashCode2 + (parcelable != null ? parcelable.hashCode() : 0)) * 31);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f58102g = parcelable;
        }
    }
}
