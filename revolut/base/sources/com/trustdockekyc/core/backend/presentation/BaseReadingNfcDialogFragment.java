package com.trustdockekyc.core.backend.presentation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import aw.h;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.trustdockekyc.core.backend.domain.model.AppError;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mx0.c9;
import n2m.a;
import n2m.b;
import n2m.c;
import n2m.e;
import org.jetbrains.annotations.NotNull;
import yhm.m;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000 \u00042\u00020\u0001:\u0003\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, d2 = {"Lcom/trustdockekyc/core/backend/presentation/BaseReadingNfcDialogFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "Companion", "n2m/a", "n2m/b", "n2m/c", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class BaseReadingNfcDialogFragment extends BottomSheetDialogFragment {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public a f107532a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final MutableLiveData f107533b0 = new MutableLiveData();
    public final MutableLiveData c0 = new MutableLiveData();

    public final void d(AppError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        m.Companion companion = m.INSTANCE;
        this.c0.postValue(new c2m.a(new m(o.a(error))));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.tdcoreekyc__fragment_reading_nfc, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        View viewFindViewById2 = view.findViewById(R.id.cancelScanningButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        View viewFindViewById3 = view.findViewById(R.id.description);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        View viewFindViewById4 = view.findViewById(R.id.icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f107532a0 = new a((TextView) viewFindViewById, (Button) viewFindViewById2, (TextView) viewFindViewById3, (ImageView) viewFindViewById4);
        c cVar = c.PREPARED;
        MutableLiveData mutableLiveData = this.f107533b0;
        mutableLiveData.setValue(cVar);
        setCancelable(false);
        a aVar = this.f107532a0;
        if (aVar == null) {
            Intrinsics.r("binding");
            throw null;
        }
        aVar.f211596b.setOnClickListener(new c9(this, 4));
        mutableLiveData.observe(getViewLifecycleOwner(), new h(new e(this, 0)));
        LifecycleOwner lifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(lifecycleOwner, "getViewLifecycleOwner(...)");
        e observer = new e(this, 1);
        MutableLiveData mutableLiveData2 = this.c0;
        Intrinsics.checkNotNullParameter(mutableLiveData2, "<this>");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(observer, "observer");
        mutableLiveData2.observe(lifecycleOwner, new h(new c2m.b(observer, 0)));
    }

    public final void z() {
        m.Companion companion = m.INSTANCE;
        this.c0.postValue(new c2m.a(new m(Unit.f186387a)));
    }
}
