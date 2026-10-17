package com.trustdockekyc.core.backend.presentation;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.trustdockekyc.core.backend.domain.model.AppError;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx0.c9;
import n2m.j;
import n2m.k;
import org.jetbrains.annotations.NotNull;
import u1m.f0;
import x2m.f;
import zh9.u0;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00042\u00020\u0001:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/trustdockekyc/core/backend/presentation/CoreEkycCommonErrorFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Companion", "n2m/j", "n2m/k", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CoreEkycCommonErrorFragment extends Fragment {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public k f107534a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public AppError f107535b0;
    public Button c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public TextView f107536d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public TextView f107537e0;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.tdcoreekyc__fragment_common_error, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Object serializable;
        Serializable serializable2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.closeButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.c0 = (Button) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f107536d0 = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.contentDescription);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f107537e0 = (TextView) viewFindViewById3;
        Bundle bundleRequireArguments = requireArguments();
        Intrinsics.checkNotNullExpressionValue(bundleRequireArguments, "requireArguments(...)");
        String string = bundleRequireArguments.getString("title");
        String string2 = bundleRequireArguments.getString("message");
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            serializable = bundleRequireArguments.getSerializable("exception", AppError.class);
        } else {
            Object serializable3 = bundleRequireArguments.getSerializable("exception");
            if (!(serializable3 instanceof AppError)) {
                serializable3 = null;
            }
            serializable = (AppError) serializable3;
        }
        AppError e = (AppError) serializable;
        if (e == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f107535b0 = e;
        StringBuilder sb6 = new StringBuilder("Received error: ");
        AppError appError = this.f107535b0;
        if (appError == null) {
            Intrinsics.r("appError");
            throw null;
        }
        sb6.append(appError);
        String message = sb6.toString();
        Intrinsics.checkNotNullParameter(e, "e");
        Intrinsics.checkNotNullParameter(message, "message");
        f0 f0Var = f0.VERBOSE;
        if (i >= 33) {
            serializable2 = bundleRequireArguments.getSerializable("verificationSettings", f.class);
        } else {
            Serializable serializable4 = bundleRequireArguments.getSerializable("verificationSettings");
            if (!(serializable4 instanceof f)) {
                serializable4 = null;
            }
            serializable2 = (f) serializable4;
        }
        f fVar = (f) serializable2;
        if (fVar == null) {
            throw new IllegalStateException("Required value was null.");
        }
        AppError appError2 = this.f107535b0;
        if (appError2 == null) {
            Intrinsics.r("appError");
            throw null;
        }
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        String string3 = contextRequireContext.getString(R.string.tdcoreekyc__unexpectedError_contentTitle);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        String string4 = contextRequireContext.getString(R.string.tdcoreekyc__unexpectedError_contentDescription);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        if (appError2 instanceof AppError.IoError ? true : appError2 instanceof AppError.NetworkConnectionFailedError ? true : appError2 instanceof AppError.TimeoutError) {
            string3 = contextRequireContext.getString(R.string.tdcoreekyc__communicationError_contentTitle);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            string4 = contextRequireContext.getString(R.string.tdcoreekyc__communicationError_contentDescription);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        } else {
            if (appError2 instanceof AppError.ServerError ? true : appError2 instanceof AppError.NetworkResponseError) {
                string3 = contextRequireContext.getString(R.string.tdcoreekyc__serverError_contentTitle);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                string4 = contextRequireContext.getString(R.string.tdcoreekyc__serverError_contentDescription);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            } else if (appError2 instanceof AppError.MaintenanceError) {
                string3 = contextRequireContext.getString(R.string.tdcoreekyc__maintenanceError_contentTitle);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                string4 = contextRequireContext.getString(R.string.tdcoreekyc__maintenanceError_contentDescription);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            } else if (appError2 instanceof AppError.MyNumberCardLockedError) {
                string3 = contextRequireContext.getString(R.string.tdcoreekyc__nfcMNLockedError_contentTitle);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                string4 = contextRequireContext.getString(R.string.tdcoreekyc__nfcMNLockedError_contentDescription);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            } else if (appError2 instanceof AppError.DriversLicenseLocked) {
                string3 = contextRequireContext.getString(R.string.tdcoreekyc__nfcDLLocked_contentTitle);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                string4 = contextRequireContext.getString(R.string.tdcoreekyc__nfcDLLocked_contentDescription);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            } else if (appError2 instanceof AppError.NoCertificate) {
                string3 = contextRequireContext.getString(R.string.tdcoreekyc__residenceCardError_contentTitle);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                string4 = contextRequireContext.getString(R.string.tdcoreekyc__residenceCardError_contentDescription_noCertification);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            } else if (appError2 instanceof AppError.Under16years) {
                string3 = contextRequireContext.getString(R.string.tdcoreekyc__residenceCardError_contentTitle);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                string4 = contextRequireContext.getString(R.string.tdcoreekyc__residenceCardError_contentDescription_under16);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            }
        }
        TextView textView = this.f107536d0;
        if (textView == null) {
            Intrinsics.r("titleView");
            throw null;
        }
        if (string == null) {
            string = string3;
        }
        textView.setText(string);
        TextView textView2 = this.f107537e0;
        if (textView2 == null) {
            Intrinsics.r("contentDescriptionView");
            throw null;
        }
        if (string2 == null) {
            string2 = string4;
        }
        textView2.setText(string2);
        Button button = this.c0;
        if (button == null) {
            Intrinsics.r("closeButton");
            throw null;
        }
        button.setOnClickListener(new c9(this, 5));
        u0.g(this, u.c(Integer.valueOf(R.id.closeButton)), fVar);
    }
}
