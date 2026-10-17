package com.revolut.feature.backend_flow.domain.models;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/BackendFlowUploadItem;", "Lcom/revolut/feature/backend_flow/domain/models/InputItem;", "<init>", "()V", "Lcom/revolut/feature/backend_flow/domain/models/BackendCardPhotoItem;", "Lcom/revolut/feature/backend_flow/domain/models/CameraUploadItem;", "Lcom/revolut/feature/backend_flow/domain/models/FilesUploadItem;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BackendFlowUploadItem implements InputItem {
    private BackendFlowUploadItem() {
    }

    public abstract String S8();

    public abstract List d();
}
