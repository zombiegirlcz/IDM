package com.revolut.domain.models.login;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;
import zhm.r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/revolut/domain/models/login/ChannelType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "PUSH", "SMS", "EMAIL", "CALL", "CHAT", "SECURITY_QUESTIONS", "PASSCODE", "SESSION", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChannelType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ChannelType[] $VALUES;
    public static final ChannelType CALL;
    public static final ChannelType CHAT;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final ChannelType EMAIL;
    public static final ChannelType PASSCODE;
    public static final ChannelType PUSH;
    public static final ChannelType SECURITY_QUESTIONS;
    public static final ChannelType SESSION;
    public static final ChannelType SMS;

    @NotNull
    private static final Map<String, ChannelType> mapping;

    /* JADX INFO: renamed from: com.revolut.domain.models.login.ChannelType$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    private static final /* synthetic */ ChannelType[] $values() {
        return new ChannelType[]{PUSH, SMS, EMAIL, CALL, CHAT, SECURITY_QUESTIONS, PASSCODE, SESSION};
    }

    static {
        ChannelType channelType = new ChannelType("PUSH", 0);
        PUSH = channelType;
        ChannelType channelType2 = new ChannelType("SMS", 1);
        SMS = channelType2;
        ChannelType channelType3 = new ChannelType("EMAIL", 2);
        EMAIL = channelType3;
        ChannelType channelType4 = new ChannelType("CALL", 3);
        CALL = channelType4;
        ChannelType channelType5 = new ChannelType("CHAT", 4);
        CHAT = channelType5;
        ChannelType channelType6 = new ChannelType("SECURITY_QUESTIONS", 5);
        SECURITY_QUESTIONS = channelType6;
        ChannelType channelType7 = new ChannelType("PASSCODE", 6);
        PASSCODE = channelType7;
        ChannelType channelType8 = new ChannelType("SESSION", 7);
        SESSION = channelType8;
        ChannelType[] channelTypeArr$values = $values();
        $VALUES = channelTypeArr$values;
        $ENTRIES = s.n(channelTypeArr$values);
        INSTANCE = new Companion();
        mapping = r0.k(new Pair("PUSH", channelType), new Pair("SMS", channelType2), new Pair("CALL", channelType4), new Pair("EMAIL", channelType3), new Pair("SECURITY_QUESTIONS", channelType6), new Pair("CHAT", channelType5), new Pair("PASSWORD", channelType7), new Pair("APP", channelType8));
    }

    private ChannelType(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static ChannelType valueOf(String str) {
        return (ChannelType) Enum.valueOf(ChannelType.class, str);
    }

    public static ChannelType[] values() {
        return (ChannelType[]) $VALUES.clone();
    }
}
