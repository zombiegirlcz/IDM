package com.revolut.feature.credit.application.plugins.api.models.config;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import hs3.q1;
import ju3.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/config/DocumentViewerScreenConfig;", "Lcom/revolut/feature/credit/application/plugins/api/models/config/ScreenConfig;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentViewerScreenConfig extends ScreenConfig {

    @NotNull
    public static final Parcelable.Creator<DocumentViewerScreenConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f66358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f66359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ju3.b f66360c;
    public final q1 d;
    public final Clause e;
    public final d f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            boolean z3 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
            } else {
                z = false;
            }
            return new DocumentViewerScreenConfig(z3, parcel.readInt() == 0 ? z : true, ju3.b.valueOf(parcel.readString()), q1.valueOf(parcel.readString()), (Clause) parcel.readParcelable(DocumentViewerScreenConfig.class.getClassLoader()), d.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DocumentViewerScreenConfig[i];
        }
    }

    public DocumentViewerScreenConfig(boolean z, boolean z3, ju3.b buttonBehaviour, q1 scrollDownBehaviour, Clause clause, d viewStyle) {
        Intrinsics.checkNotNullParameter(buttonBehaviour, "buttonBehaviour");
        Intrinsics.checkNotNullParameter(scrollDownBehaviour, "scrollDownBehaviour");
        Intrinsics.checkNotNullParameter(viewStyle, "viewStyle");
        this.f66358a = z;
        this.f66359b = z3;
        this.f66360c = buttonBehaviour;
        this.d = scrollDownBehaviour;
        this.e = clause;
        this.f = viewStyle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DocumentViewerScreenConfig)) {
            return false;
        }
        DocumentViewerScreenConfig documentViewerScreenConfig = (DocumentViewerScreenConfig) obj2;
        return this.f66358a == documentViewerScreenConfig.f66358a && this.f66359b == documentViewerScreenConfig.f66359b && this.f66360c == documentViewerScreenConfig.f66360c && this.d == documentViewerScreenConfig.d && Intrinsics.f(this.e, documentViewerScreenConfig.e) && this.f == documentViewerScreenConfig.f;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.f66360c.hashCode() + j6.a.c(Boolean.hashCode(this.f66358a) * 31, 31, this.f66359b)) * 31)) * 31;
        Clause clause = this.e;
        return this.f.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f66358a ? 1 : 0);
        dest.writeInt(this.f66359b ? 1 : 0);
        dest.writeString(this.f66360c.name());
        dest.writeString(this.d.name());
        dest.writeParcelable(this.e, i);
        dest.writeString(this.f.name());
    }

    public /* synthetic */ DocumentViewerScreenConfig(boolean z, boolean z3, ju3.b bVar, q1 q1Var, TextLocalisedClause textLocalisedClause, d dVar, int i) {
        this(z, z3, (i & 4) != 0 ? ju3.b.QUICK_READ_ACTION_SUPPORT : bVar, (i & 8) != 0 ? q1.SCROLL_ONE_PAGE : q1Var, (i & 16) != 0 ? null : textLocalisedClause, (i & 32) != 0 ? d.FULL : dVar);
    }
}
