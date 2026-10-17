package com.revolut.core.model.faq;

import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/revolut/core/model/faq/FaqNodeBase;", "Landroid/os/Parcelable;", "Lcom/revolut/core/model/faq/FaqNode;", "Lcom/revolut/core/model/faq/PigeonNode;", "core_faq_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface FaqNodeBase extends Parcelable {
    String getKey();

    String getTitle();
}
