package com.revolut.feature.crypto_feed.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB\u0013\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bJ\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/revolut/feature/crypto_feed/models/CryptoWidgetContext;", "Lcom/revolut/feature/widgets/api/dependencies/WidgetContext;", "", "contextKey", "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/revolut/feature/crypto_feed/models/CryptoWidgetContext;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "toString", "Ljava/lang/String;", "getContextKey", "Companion", "a", "feature_crypto_feed_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoWidgetContext extends WidgetContext {

    @NotNull
    private final String contextKey;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<CryptoWidgetContext> CREATOR = new b();

    /* JADX INFO: renamed from: com.revolut.feature.crypto_feed.models.CryptoWidgetContext$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static CryptoWidgetContext a() {
            return new CryptoWidgetContext("RetailCryptoSingleFeed", null);
        }

        public static CryptoWidgetContext b() {
            return new CryptoWidgetContext("RetailCryptoPortfolio", null);
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoWidgetContext(parcel.readString(), null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoWidgetContext[i];
        }
    }

    public /* synthetic */ CryptoWidgetContext(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public static /* synthetic */ CryptoWidgetContext copy$default(CryptoWidgetContext cryptoWidgetContext, String str, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = cryptoWidgetContext.contextKey;
        }
        return cryptoWidgetContext.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getContextKey() {
        return this.contextKey;
    }

    @NotNull
    public final CryptoWidgetContext copy(@NotNull String contextKey) {
        Intrinsics.checkNotNullParameter(contextKey, "contextKey");
        return new CryptoWidgetContext(contextKey);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CryptoWidgetContext) && Intrinsics.f(this.contextKey, ((CryptoWidgetContext) other).contextKey);
    }

    @Override // com.revolut.feature.widgets.api.dependencies.WidgetContext
    @NotNull
    /* JADX INFO: renamed from: getContextKey */
    public String getF74702a() {
        return this.contextKey;
    }

    public int hashCode() {
        return this.contextKey.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.contextKey);
    }

    private CryptoWidgetContext(String str) {
        this.contextKey = str;
    }

    public /* synthetic */ CryptoWidgetContext(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "RetailCryptoPortfolio" : str);
    }
}
