package eci;

import bci.c;
import com.revolut.feature_retail_user_declarations.purpose.service.PurposeOfAccountService;
import dp4.a1;
import ebi.i;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PurposeOfAccountService f124754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f124755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x4l.c f124756c;

    public b(PurposeOfAccountService purposeOfAccountService, c catalogDtoMapper) {
        Intrinsics.checkNotNullParameter(purposeOfAccountService, "purposeOfAccountService");
        Intrinsics.checkNotNullParameter(catalogDtoMapper, "catalogDtoMapper");
        this.f124754a = purposeOfAccountService;
        this.f124755b = catalogDtoMapper;
        Continuation continuation = null;
        this.f124756c = new x4l.c(new a1(this, continuation, 12), new i(9), new e6e.a(23), new e31.i(2, 3, null), new a(3, 0, continuation));
    }
}
