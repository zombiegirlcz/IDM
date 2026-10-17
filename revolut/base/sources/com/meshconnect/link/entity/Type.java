package com.meshconnect.link.entity;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/meshconnect/link/entity/Type;", "", "<init>", "(Ljava/lang/String;I)V", "brokerageAccountAccessToken", "error", "close", "done", "showClose", "transferFinished", "loaded", "delayedAuthentication", "openTrueAuth", "link_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Type {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Type[] $VALUES;
    public static final Type brokerageAccountAccessToken = new Type("brokerageAccountAccessToken", 0);
    public static final Type error = new Type("error", 1);
    public static final Type close = new Type("close", 2);
    public static final Type done = new Type("done", 3);
    public static final Type showClose = new Type("showClose", 4);
    public static final Type transferFinished = new Type("transferFinished", 5);
    public static final Type loaded = new Type("loaded", 6);
    public static final Type delayedAuthentication = new Type("delayedAuthentication", 7);
    public static final Type openTrueAuth = new Type("openTrueAuth", 8);

    private static final /* synthetic */ Type[] $values() {
        return new Type[]{brokerageAccountAccessToken, error, close, done, showClose, transferFinished, loaded, delayedAuthentication, openTrueAuth};
    }

    static {
        Type[] typeArr$values = $values();
        $VALUES = typeArr$values;
        $ENTRIES = s.n(typeArr$values);
    }

    private Type(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static Type valueOf(String str) {
        return (Type) Enum.valueOf(Type.class, str);
    }

    public static Type[] values() {
        return (Type[]) $VALUES.clone();
    }
}
