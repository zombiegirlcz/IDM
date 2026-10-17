package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcelable;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xl2.e;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/BackendFlowBinary;", "Landroid/os/Parcelable;", "Companion", "xl2/e", "a", "Lcom/revolut/feature/backend_flow/domain/models/BackendFlowFile;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BackendFlowBinary implements Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f63268a;

    /* JADX INFO: renamed from: com.revolut.feature.backend_flow.domain.models.BackendFlowBinary$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static BackendFlowFile a(Companion companion, File file, e eVar, String str, int i) {
            if ((i & 2) != 0) {
                eVar = e.SUCCESS;
            }
            e status = eVar;
            if ((i & 4) != 0) {
                str = null;
            }
            companion.getClass();
            Intrinsics.checkNotNullParameter(file, "file");
            Intrinsics.checkNotNullParameter(status, "status");
            String absolutePath = file.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
            String name = file.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            return new BackendFlowFile(absolutePath, name, str, null, status, file);
        }
    }

    public BackendFlowBinary(List list) {
        this.f63268a = list;
    }
}
