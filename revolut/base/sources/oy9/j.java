package oy9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final py9.a f230924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kgm.i f230925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.b f230926c;

    public j(py9.a contactsSearchInteractor, kgm.i usernameSearchInteractor) {
        Intrinsics.checkNotNullParameter(contactsSearchInteractor, "contactsSearchInteractor");
        Intrinsics.checkNotNullParameter(usernameSearchInteractor, "usernameSearchInteractor");
        this.f230924a = contactsSearchInteractor;
        this.f230925b = usernameSearchInteractor;
        ihm.b bVarE = ihm.b.e("");
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.f230926c = bVarE;
    }
}
