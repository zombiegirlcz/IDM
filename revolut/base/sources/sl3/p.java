package sl3;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class p {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xe0.e f264124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ao.h f264125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l80.e f264126c;

    public p(xe0.e contactsStorage, ao.h contactsDataStorage, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(contactsStorage, "contactsStorage");
        Intrinsics.checkNotNullParameter(contactsDataStorage, "contactsDataStorage");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f264124a = contactsStorage;
        this.f264125b = contactsDataStorage;
        this.f264126c = dateProvider;
    }
}
