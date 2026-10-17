package cj1;

import akl.o;
import com.revolut.feature.address.impl.data.network.AddressAutocompleteService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AddressAutocompleteService f24579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x4l.c f24580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x4l.c f24581c;

    public c(AddressAutocompleteService addressAutocompleteService) {
        Intrinsics.checkNotNullParameter(addressAutocompleteService, "addressAutocompleteService");
        this.f24579a = addressAutocompleteService;
        Continuation continuation = null;
        int i = 19;
        this.f24580b = new x4l.c(new b6a.d(this, continuation, 24), new an0.e(8), new akg.d(16), new o(i), new a19.e(i));
        int i2 = 20;
        this.f24581c = new x4l.c(new b6a.d(this, continuation, 25), new an0.e(9), new akg.d(17), new o(i2), new a19.e(i2));
    }
}
