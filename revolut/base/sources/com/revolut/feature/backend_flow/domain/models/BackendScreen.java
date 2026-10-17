package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcelable;
import kotlin.Metadata;
import xl2.g0;
import xl2.t;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\t\b\u0004¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\t\u0007\b\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/BackendScreen;", "Lxl2/t;", "", "Lxl2/g0;", "Landroid/os/Parcelable;", "<init>", "()V", "Lcom/revolut/feature/backend_flow/domain/models/BottomPromptScreen;", "Lcom/revolut/feature/backend_flow/domain/models/DeeplinkScreen;", "Lcom/revolut/feature/backend_flow/domain/models/FormScreen;", "Lcom/revolut/feature/backend_flow/domain/models/HtmlPromptScreen;", "Lcom/revolut/feature/backend_flow/domain/models/PromptScreen;", "Lcom/revolut/feature/backend_flow/domain/models/StatusDialogScreen;", "Lcom/revolut/feature/backend_flow/domain/models/StoriesScreen;", "Lcom/revolut/feature/backend_flow/domain/models/SummaryScreen;", "Lcom/revolut/feature/backend_flow/domain/models/TutorialScreen;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BackendScreen implements t, g0, Parcelable {
    private BackendScreen() {
    }

    public abstract String j();
}
