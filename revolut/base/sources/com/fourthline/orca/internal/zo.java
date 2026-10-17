package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class zo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set f35654a;

    static {
        DocumentType[] elements = {DocumentType.PROOF_OF_ADDRESS, DocumentType.PAPER_ID};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f35654a = kotlin.collections.d.y0(elements);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t70 b(DocumentType documentType) {
        return f35654a.contains(documentType) ? t70.f33239a : t70.f33240b;
    }
}
