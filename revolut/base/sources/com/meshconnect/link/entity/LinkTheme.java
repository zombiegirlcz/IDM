package com.meshconnect.link.entity;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/meshconnect/link/entity/LinkTheme;", "", "<init>", "(Ljava/lang/String;I)V", "LIGHT", "DARK", "SYSTEM", "link_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LinkTheme {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LinkTheme[] $VALUES;
    public static final LinkTheme LIGHT = new LinkTheme("LIGHT", 0);
    public static final LinkTheme DARK = new LinkTheme("DARK", 1);
    public static final LinkTheme SYSTEM = new LinkTheme("SYSTEM", 2);

    private static final /* synthetic */ LinkTheme[] $values() {
        return new LinkTheme[]{LIGHT, DARK, SYSTEM};
    }

    static {
        LinkTheme[] linkThemeArr$values = $values();
        $VALUES = linkThemeArr$values;
        $ENTRIES = s.n(linkThemeArr$values);
    }

    private LinkTheme(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static LinkTheme valueOf(String str) {
        return (LinkTheme) Enum.valueOf(LinkTheme.class, str);
    }

    public static LinkTheme[] values() {
        return (LinkTheme[]) $VALUES.clone();
    }
}
