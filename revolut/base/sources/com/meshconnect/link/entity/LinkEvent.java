package com.meshconnect.link.entity;

import ch.qos.logback.core.CoreConstants;
import j6.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/meshconnect/link/entity/LinkEvent;", "", "Done", "Close", "ShowClose", "Loaded", "TrueAuth", "Payload", "Lcom/meshconnect/link/entity/LinkEvent$Close;", "Lcom/meshconnect/link/entity/LinkEvent$Done;", "Lcom/meshconnect/link/entity/LinkEvent$Loaded;", "Lcom/meshconnect/link/entity/LinkEvent$Payload;", "Lcom/meshconnect/link/entity/LinkEvent$ShowClose;", "Lcom/meshconnect/link/entity/LinkEvent$TrueAuth;", "link_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface LinkEvent {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/meshconnect/link/entity/LinkEvent$Close;", "Lcom/meshconnect/link/entity/LinkEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "link_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Close implements LinkEvent {

        @NotNull
        public static final Close INSTANCE = new Close();

        private Close() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Close);
        }

        public int hashCode() {
            return -422611467;
        }

        @NotNull
        public String toString() {
            return "Close";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/meshconnect/link/entity/LinkEvent$Done;", "Lcom/meshconnect/link/entity/LinkEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "link_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Done implements LinkEvent {

        @NotNull
        public static final Done INSTANCE = new Done();

        private Done() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Done);
        }

        public int hashCode() {
            return -844883995;
        }

        @NotNull
        public String toString() {
            return "Done";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/meshconnect/link/entity/LinkEvent$Loaded;", "Lcom/meshconnect/link/entity/LinkEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "link_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Loaded implements LinkEvent {

        @NotNull
        public static final Loaded INSTANCE = new Loaded();

        private Loaded() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Loaded);
        }

        public int hashCode() {
            return 43947944;
        }

        @NotNull
        public String toString() {
            return "Loaded";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/meshconnect/link/entity/LinkEvent$Payload;", "Lcom/meshconnect/link/entity/LinkEvent;", "payload", "Lcom/meshconnect/link/entity/LinkPayload;", "<init>", "(Lcom/meshconnect/link/entity/LinkPayload;)V", "getPayload", "()Lcom/meshconnect/link/entity/LinkPayload;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "link_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Payload implements LinkEvent {

        @NotNull
        private final LinkPayload payload;

        public Payload(@NotNull LinkPayload payload) {
            Intrinsics.checkNotNullParameter(payload, "payload");
            this.payload = payload;
        }

        public static /* synthetic */ Payload copy$default(Payload payload, LinkPayload linkPayload, int i, Object obj2) {
            if ((i & 1) != 0) {
                linkPayload = payload.payload;
            }
            return payload.copy(linkPayload);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final LinkPayload getPayload() {
            return this.payload;
        }

        @NotNull
        public final Payload copy(@NotNull LinkPayload payload) {
            Intrinsics.checkNotNullParameter(payload, "payload");
            return new Payload(payload);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Payload) && Intrinsics.f(this.payload, ((Payload) other).payload);
        }

        @NotNull
        public final LinkPayload getPayload() {
            return this.payload;
        }

        public int hashCode() {
            return this.payload.hashCode();
        }

        @NotNull
        public String toString() {
            return "Payload(payload=" + this.payload + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/meshconnect/link/entity/LinkEvent$ShowClose;", "Lcom/meshconnect/link/entity/LinkEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "link_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ShowClose implements LinkEvent {

        @NotNull
        public static final ShowClose INSTANCE = new ShowClose();

        private ShowClose() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ShowClose);
        }

        public int hashCode() {
            return 259177080;
        }

        @NotNull
        public String toString() {
            return "ShowClose";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/meshconnect/link/entity/LinkEvent$TrueAuth;", "Lcom/meshconnect/link/entity/LinkEvent;", "link", "", "atomicToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getLink", "()Ljava/lang/String;", "getAtomicToken", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "link_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TrueAuth implements LinkEvent {

        @NotNull
        private final String atomicToken;

        @NotNull
        private final String link;

        public TrueAuth(@NotNull String link, @NotNull String atomicToken) {
            Intrinsics.checkNotNullParameter(link, "link");
            Intrinsics.checkNotNullParameter(atomicToken, "atomicToken");
            this.link = link;
            this.atomicToken = atomicToken;
        }

        public static /* synthetic */ TrueAuth copy$default(TrueAuth trueAuth, String str, String str2, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = trueAuth.link;
            }
            if ((i & 2) != 0) {
                str2 = trueAuth.atomicToken;
            }
            return trueAuth.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getLink() {
            return this.link;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getAtomicToken() {
            return this.atomicToken;
        }

        @NotNull
        public final TrueAuth copy(@NotNull String link, @NotNull String atomicToken) {
            Intrinsics.checkNotNullParameter(link, "link");
            Intrinsics.checkNotNullParameter(atomicToken, "atomicToken");
            return new TrueAuth(link, atomicToken);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TrueAuth)) {
                return false;
            }
            TrueAuth trueAuth = (TrueAuth) other;
            return Intrinsics.f(this.link, trueAuth.link) && Intrinsics.f(this.atomicToken, trueAuth.atomicToken);
        }

        @NotNull
        public final String getAtomicToken() {
            return this.atomicToken;
        }

        @NotNull
        public final String getLink() {
            return this.link;
        }

        public int hashCode() {
            return this.atomicToken.hashCode() + (this.link.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb6 = new StringBuilder("TrueAuth(link=");
            sb6.append(this.link);
            sb6.append(", atomicToken=");
            return a.u(sb6, this.atomicToken, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }
}
