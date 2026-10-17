package com.fourthline.core;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/fourthline/core/DocumentFileSide;", "", "<init>", "(Ljava/lang/String;I)V", "FRONT", "BACK", "INSIDE_LEFT", "INSIDE_RIGHT", "fourthline-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DocumentFileSide {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ DocumentFileSide[] f26249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f26250b;
    public static final DocumentFileSide FRONT = new DocumentFileSide("FRONT", 0);
    public static final DocumentFileSide BACK = new DocumentFileSide("BACK", 1);
    public static final DocumentFileSide INSIDE_LEFT = new DocumentFileSide("INSIDE_LEFT", 2);
    public static final DocumentFileSide INSIDE_RIGHT = new DocumentFileSide("INSIDE_RIGHT", 3);

    static {
        DocumentFileSide[] documentFileSideArrA = a();
        f26249a = documentFileSideArrA;
        f26250b = s.n(documentFileSideArrA);
    }

    private DocumentFileSide(String str, int i) {
    }

    private static final /* synthetic */ DocumentFileSide[] a() {
        return new DocumentFileSide[]{FRONT, BACK, INSIDE_LEFT, INSIDE_RIGHT};
    }

    @NotNull
    public static EnumEntries getEntries() {
        return f26250b;
    }

    public static DocumentFileSide valueOf(String str) {
        return (DocumentFileSide) Enum.valueOf(DocumentFileSide.class, str);
    }

    public static DocumentFileSide[] values() {
        return (DocumentFileSide[]) f26249a.clone();
    }
}
