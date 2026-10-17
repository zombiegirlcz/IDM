package com.revolut.feature.statements.api.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/statements/api/models/StatementUrlState;", "", "<init>", "()V", "Ready", "InPreparation", "Lcom/revolut/feature/statements/api/models/StatementUrlState$InPreparation;", "Lcom/revolut/feature/statements/api/models/StatementUrlState$Ready;", "retail_feature_statements_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class StatementUrlState {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/revolut/feature/statements/api/models/StatementUrlState$InPreparation;", "Lcom/revolut/feature/statements/api/models/StatementUrlState;", "email", "", "<init>", "(Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "retail_feature_statements_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InPreparation extends StatementUrlState {
        private final String email;

        /* JADX WARN: Multi-variable type inference failed */
        public InPreparation() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ InPreparation copy$default(InPreparation inPreparation, String str, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = inPreparation.email;
            }
            return inPreparation.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        @NotNull
        public final InPreparation copy(String email) {
            return new InPreparation(email);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InPreparation) && Intrinsics.f(this.email, ((InPreparation) other).email);
        }

        public final String getEmail() {
            return this.email;
        }

        public int hashCode() {
            String str = this.email;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public InPreparation(String str) {
            super(null);
            this.email = str;
        }

        public /* synthetic */ InPreparation(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/revolut/feature/statements/api/models/StatementUrlState$Ready;", "Lcom/revolut/feature/statements/api/models/StatementUrlState;", "url", "", "<init>", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "retail_feature_statements_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Ready extends StatementUrlState {

        @NotNull
        private final String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ready(@NotNull String url2) {
            super(null);
            Intrinsics.checkNotNullParameter(url2, "url");
            this.url = url2;
        }

        public static /* synthetic */ Ready copy$default(Ready ready, String str, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = ready.url;
            }
            return ready.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @NotNull
        public final Ready copy(@NotNull String url2) {
            Intrinsics.checkNotNullParameter(url2, "url");
            return new Ready(url2);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Ready) && Intrinsics.f(this.url, ((Ready) other).url);
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.url.hashCode();
        }
    }

    public /* synthetic */ StatementUrlState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private StatementUrlState() {
    }
}
