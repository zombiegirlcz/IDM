package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.facematchingjapantd;

import androidx.annotation.Keep;
import ch.qos.logback.core.CoreConstants;
import java.util.List;
import k1m.i;
import k1m.m;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX INFO: loaded from: classes12.dex */
@m(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\tB\u0017\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u0007\u001a\u00020\u00002\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/facematchingjapantd/PostFaceMatchingJapanTdProcessesRandomShootingPatternResponse;", "", "", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/facematchingjapantd/PostFaceMatchingJapanTdProcessesRandomShootingPatternResponse$Action;", "actions", "<init>", "(Ljava/util/List;)V", "copy", "(Ljava/util/List;)Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/facematchingjapantd/PostFaceMatchingJapanTdProcessesRandomShootingPatternResponse;", "Action", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PostFaceMatchingJapanTdProcessesRandomShootingPatternResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f107417a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Keep
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/facematchingjapantd/PostFaceMatchingJapanTdProcessesRandomShootingPatternResponse$Action;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lx1m/a;", "toModel", "()Lx1m/a;", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "RIGHT", "LEFT", "FRONT", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Action {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Action[] $VALUES;

        @NotNull
        private final String value;

        @i(name = "right")
        public static final Action RIGHT = new Action("RIGHT", 0, "right");

        @i(name = "left")
        public static final Action LEFT = new Action("LEFT", 1, "left");

        @i(name = "front")
        public static final Action FRONT = new Action("FRONT", 2, "front");

        private static final /* synthetic */ Action[] $values() {
            return new Action[]{RIGHT, LEFT, FRONT};
        }

        static {
            Action[] actionArr$values = $values();
            $VALUES = actionArr$values;
            $ENTRIES = s.n(actionArr$values);
        }

        private Action(String str, int i, String str2) {
            this.value = str2;
        }

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) $VALUES.clone();
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }

        @NotNull
        public final x1m.a toModel() {
            int i = d.f107420a[ordinal()];
            if (i == 1) {
                return x1m.a.LEFT;
            }
            if (i == 2) {
                return x1m.a.RIGHT;
            }
            if (i == 3) {
                return x1m.a.FRONT;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public PostFaceMatchingJapanTdProcessesRandomShootingPatternResponse(@i(name = "actions") @NotNull List<? extends Action> actions) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f107417a = actions;
    }

    @NotNull
    public final PostFaceMatchingJapanTdProcessesRandomShootingPatternResponse copy(@i(name = "actions") @NotNull List<? extends Action> actions) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        return new PostFaceMatchingJapanTdProcessesRandomShootingPatternResponse(actions);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof PostFaceMatchingJapanTdProcessesRandomShootingPatternResponse) && Intrinsics.f(this.f107417a, ((PostFaceMatchingJapanTdProcessesRandomShootingPatternResponse) obj2).f107417a);
    }

    public final int hashCode() {
        return this.f107417a.hashCode();
    }

    public final String toString() {
        return m72.b.p(CoreConstants.RIGHT_PARENTHESIS_CHAR, this.f107417a, new StringBuilder("PostFaceMatchingJapanTdProcessesRandomShootingPatternResponse(actions="));
    }
}
