package com.onfido.android.sdk.capture.internal.util;

import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import elm.f;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import skm.p0;
import zkm.o;

/* JADX INFO: loaded from: classes17.dex */
@InternalOnfidoApi
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/util/DefaultDispatchersProvider;", "Lcom/onfido/android/sdk/capture/internal/util/DispatchersProvider;", "()V", "default", "Lkotlinx/coroutines/CoroutineDispatcher;", "getDefault", "()Lkotlinx/coroutines/CoroutineDispatcher;", "io", "getIo", "main", "getMain", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DefaultDispatchersProvider implements DispatchersProvider {

    @NotNull
    public static final DefaultDispatchersProvider INSTANCE = new DefaultDispatchersProvider();

    @NotNull
    private static final CoroutineDispatcher default;

    @NotNull
    private static final CoroutineDispatcher io;

    @NotNull
    private static final CoroutineDispatcher main;

    static {
        p0 p0Var = p0.f264001a;
        main = o.f323119a.e;
        default = p0.f264002b;
        io = f.f127540b;
    }

    private DefaultDispatchersProvider() {
    }

    @Override // com.onfido.android.sdk.capture.internal.util.DispatchersProvider
    @NotNull
    /* JADX INFO: renamed from: getDefault */
    public CoroutineDispatcher mo3706getDefault() {
        return default;
    }

    @Override // com.onfido.android.sdk.capture.internal.util.DispatchersProvider
    @NotNull
    public CoroutineDispatcher getIo() {
        return io;
    }

    @Override // com.onfido.android.sdk.capture.internal.util.DispatchersProvider
    @NotNull
    public CoroutineDispatcher getMain() {
        return main;
    }
}
