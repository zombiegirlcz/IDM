package com.revolut.feature.alipay_plus.mpm.core;

import com.revolut.feature.alipay_plus.mpm.model.APMPMError;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/core/APMPMDecodeDecision;", "", "<init>", "()V", "Complete", "Load", "Fail", "Lcom/revolut/feature/alipay_plus/mpm/core/APMPMDecodeDecision$Complete;", "Lcom/revolut/feature/alipay_plus/mpm/core/APMPMDecodeDecision$Fail;", "Lcom/revolut/feature/alipay_plus/mpm/core/APMPMDecodeDecision$Load;", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class APMPMDecodeDecision {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/core/APMPMDecodeDecision$Complete;", "Lcom/revolut/feature/alipay_plus/mpm/core/APMPMDecodeDecision;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Complete extends APMPMDecodeDecision {

        @NotNull
        public static final Complete INSTANCE = new Complete();

        private Complete() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Complete);
        }

        public int hashCode() {
            return 690643674;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/core/APMPMDecodeDecision$Fail;", "Lcom/revolut/feature/alipay_plus/mpm/core/APMPMDecodeDecision;", "error", "Lcom/revolut/feature/alipay_plus/mpm/model/APMPMError;", "<init>", "(Lcom/revolut/feature/alipay_plus/mpm/model/APMPMError;)V", "getError", "()Lcom/revolut/feature/alipay_plus/mpm/model/APMPMError;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Fail extends APMPMDecodeDecision {

        @NotNull
        private final APMPMError error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Fail(@NotNull APMPMError error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        public static /* synthetic */ Fail copy$default(Fail fail, APMPMError aPMPMError, int i, Object obj2) {
            if ((i & 1) != 0) {
                aPMPMError = fail.error;
            }
            return fail.copy(aPMPMError);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final APMPMError getError() {
            return this.error;
        }

        @NotNull
        public final Fail copy(@NotNull APMPMError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new Fail(error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Fail) && Intrinsics.f(this.error, ((Fail) other).error);
        }

        @NotNull
        public final APMPMError getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/core/APMPMDecodeDecision$Load;", "Lcom/revolut/feature/alipay_plus/mpm/core/APMPMDecodeDecision;", "redirectUrl", "", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getRedirectUrl", "()Ljava/lang/String;", "getTitle", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Load extends APMPMDecodeDecision {

        @NotNull
        private final String redirectUrl;
        private final String title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Load(@NotNull String redirectUrl, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(redirectUrl, "redirectUrl");
            this.redirectUrl = redirectUrl;
            this.title = str;
        }

        public static /* synthetic */ Load copy$default(Load load, String str, String str2, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = load.redirectUrl;
            }
            if ((i & 2) != 0) {
                str2 = load.title;
            }
            return load.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getRedirectUrl() {
            return this.redirectUrl;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final Load copy(@NotNull String redirectUrl, String title) {
            Intrinsics.checkNotNullParameter(redirectUrl, "redirectUrl");
            return new Load(redirectUrl, title);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Load)) {
                return false;
            }
            Load load = (Load) other;
            return Intrinsics.f(this.redirectUrl, load.redirectUrl) && Intrinsics.f(this.title, load.title);
        }

        @NotNull
        public final String getRedirectUrl() {
            return this.redirectUrl;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = this.redirectUrl.hashCode() * 31;
            String str = this.title;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }
    }

    public /* synthetic */ APMPMDecodeDecision(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private APMPMDecodeDecision() {
    }
}
