package com.revolut.domain.models.property;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/revolut/domain/models/property/UserActionType;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "a", "SCREEN_DURATION", "UNKNOWN", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UserActionType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ UserActionType[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final UserActionType SCREEN_DURATION = new UserActionType("SCREEN_DURATION", 0, "SCREEN_DURATION");
    public static final UserActionType UNKNOWN = new UserActionType("UNKNOWN", 1, "UNKNOWN");

    @NotNull
    private final String value;

    /* JADX INFO: renamed from: com.revolut.domain.models.property.UserActionType$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    private static final /* synthetic */ UserActionType[] $values() {
        return new UserActionType[]{SCREEN_DURATION, UNKNOWN};
    }

    static {
        UserActionType[] userActionTypeArr$values = $values();
        $VALUES = userActionTypeArr$values;
        $ENTRIES = s.n(userActionTypeArr$values);
        INSTANCE = new Companion();
    }

    private UserActionType(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static final UserActionType fromString(@NotNull String type) {
        UserActionType userActionType;
        INSTANCE.getClass();
        Intrinsics.checkNotNullParameter(type, "type");
        UserActionType[] userActionTypeArrValues = values();
        int length = userActionTypeArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                userActionType = null;
                break;
            }
            userActionType = userActionTypeArrValues[i];
            if (Intrinsics.f(type, userActionType.getValue())) {
                break;
            }
            i++;
        }
        return userActionType == null ? UNKNOWN : userActionType;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static UserActionType valueOf(String str) {
        return (UserActionType) Enum.valueOf(UserActionType.class, str);
    }

    public static UserActionType[] values() {
        return (UserActionType[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
