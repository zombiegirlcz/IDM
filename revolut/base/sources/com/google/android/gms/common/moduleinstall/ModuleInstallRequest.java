package com.google.android.gms.common.moduleinstall;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.OptionalModuleApi;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class ModuleInstallRequest {
    private final List zaa;

    /* JADX INFO: renamed from: zab, reason: collision with root package name */
    private final InstallStatusListener f38191zab;

    /* JADX INFO: renamed from: zac, reason: collision with root package name */
    private final Executor f38192zac;

    public static class Builder {
        private final List zaa = new ArrayList();

        /* JADX INFO: renamed from: zab, reason: collision with root package name */
        private InstallStatusListener f38193zab;

        /* JADX INFO: renamed from: zac, reason: collision with root package name */
        private Executor f38194zac;

        @NonNull
        public Builder addApi(@NonNull OptionalModuleApi optionalModuleApi) {
            this.zaa.add(optionalModuleApi);
            return this;
        }

        @NonNull
        public ModuleInstallRequest build() {
            return new ModuleInstallRequest(this.zaa, this.f38193zab, this.f38194zac, true, null);
        }

        @NonNull
        public Builder setListener(@NonNull InstallStatusListener installStatusListener, Executor executor) {
            this.f38193zab = installStatusListener;
            this.f38194zac = executor;
            return this;
        }

        @NonNull
        public Builder setListener(@NonNull InstallStatusListener installStatusListener) {
            return setListener(installStatusListener, null);
        }
    }

    public /* synthetic */ ModuleInstallRequest(List list, InstallStatusListener installStatusListener, Executor executor, boolean z, zac zacVar) {
        Preconditions.checkNotNull(list, "APIs must not be null.");
        Preconditions.checkArgument(!list.isEmpty(), "APIs must not be empty.");
        if (executor != null) {
            Preconditions.checkNotNull(installStatusListener, "Listener must not be null when listener executor is set.");
        }
        this.zaa = list;
        this.f38191zab = installStatusListener;
        this.f38192zac = executor;
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder();
    }

    @NonNull
    public List<OptionalModuleApi> getApis() {
        return this.zaa;
    }

    public InstallStatusListener getListener() {
        return this.f38191zab;
    }

    public Executor getListenerExecutor() {
        return this.f38192zac;
    }
}
