package com.onfido.hosted.web.module;

import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.onfido.android.sdk.capture.common.permissions.PermissionResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001c\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\fH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J,\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u001c\u0010\u0019\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\fH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/onfido/hosted/web/module/ChromeClient;", "Landroid/webkit/WebChromeClient;", "permissionDelegate", "Lcom/onfido/hosted/web/module/PermissionDelegate;", "pickerDelegate", "Lcom/onfido/hosted/web/module/PickerDelegate;", "bridgeUrl", "Landroid/net/Uri;", "(Lcom/onfido/hosted/web/module/PermissionDelegate;Lcom/onfido/hosted/web/module/PickerDelegate;Landroid/net/Uri;)V", "askPermissionAndTakePicture", "", "filePathCallback", "Landroid/webkit/ValueCallback;", "", "getDefaultVideoPoster", "Landroid/graphics/Bitmap;", "onPermissionRequest", "request", "Landroid/webkit/PermissionRequest;", "onShowFileChooser", "", "webView", "Landroid/webkit/WebView;", "fileChooserParams", "Landroid/webkit/WebChromeClient$FileChooserParams;", "takePicture", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ChromeClient extends WebChromeClient {

    @NotNull
    private final Uri bridgeUrl;

    @NotNull
    private final PermissionDelegate permissionDelegate;

    @NotNull
    private final PickerDelegate pickerDelegate;

    /* JADX INFO: renamed from: com.onfido.hosted.web.module.ChromeClient$askPermissionAndTakePicture$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/onfido/android/sdk/capture/common/permissions/PermissionResult;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends u implements Function1<PermissionResult, Unit> {
        final /* synthetic */ ValueCallback<Uri[]> $filePathCallback;
        final /* synthetic */ ChromeClient this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ValueCallback<Uri[]> valueCallback, ChromeClient chromeClient) {
            super(1);
            this.$filePathCallback = valueCallback;
            this.this$0 = chromeClient;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((PermissionResult) obj2);
            return Unit.f186387a;
        }

        public final void invoke(@NotNull PermissionResult it8) {
            Intrinsics.checkNotNullParameter(it8, "it");
            if (Intrinsics.f(it8, PermissionResult.Canceled.INSTANCE) ? true : Intrinsics.f(it8, PermissionResult.NavigateBack.INSTANCE)) {
                this.$filePathCallback.onReceiveValue(new Uri[0]);
            } else if (it8 instanceof PermissionResult.Granted) {
                this.this$0.takePicture(this.$filePathCallback);
            }
        }
    }

    /* JADX INFO: renamed from: com.onfido.hosted.web.module.ChromeClient$onPermissionRequest$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "result", "Lcom/onfido/android/sdk/capture/common/permissions/PermissionResult;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass2 extends u implements Function1<PermissionResult, Unit> {
        final /* synthetic */ List<String> $grants;
        final /* synthetic */ PermissionRequest $request;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PermissionRequest permissionRequest, List<String> list) {
            super(1);
            this.$request = permissionRequest;
            this.$grants = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((PermissionResult) obj2);
            return Unit.f186387a;
        }

        public final void invoke(@NotNull PermissionResult result) {
            Intrinsics.checkNotNullParameter(result, "result");
            if (Intrinsics.f(result, PermissionResult.Canceled.INSTANCE) ? true : Intrinsics.f(result, PermissionResult.NavigateBack.INSTANCE)) {
                this.$request.deny();
            } else if (result instanceof PermissionResult.Granted) {
                this.$request.grant((String[]) this.$grants.toArray(new String[0]));
            }
        }
    }

    /* JADX INFO: renamed from: com.onfido.hosted.web.module.ChromeClient$onShowFileChooser$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/net/Uri;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C21731 extends u implements Function1<Uri, Unit> {
        final /* synthetic */ ValueCallback<Uri[]> $filePathCallback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21731(ValueCallback<Uri[]> valueCallback) {
            super(1);
            this.$filePathCallback = valueCallback;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((Uri) obj2);
            return Unit.f186387a;
        }

        public final void invoke(Uri uri2) {
            if (uri2 != null) {
                this.$filePathCallback.onReceiveValue(new Uri[]{uri2});
            } else {
                this.$filePathCallback.onReceiveValue(new Uri[0]);
            }
        }
    }

    /* JADX INFO: renamed from: com.onfido.hosted.web.module.ChromeClient$takePicture$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/net/Uri;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C21741 extends u implements Function1<Uri, Unit> {
        final /* synthetic */ ValueCallback<Uri[]> $filePathCallback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21741(ValueCallback<Uri[]> valueCallback) {
            super(1);
            this.$filePathCallback = valueCallback;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((Uri) obj2);
            return Unit.f186387a;
        }

        public final void invoke(Uri uri2) {
            if (uri2 != null) {
                this.$filePathCallback.onReceiveValue(new Uri[]{uri2});
            } else {
                this.$filePathCallback.onReceiveValue(new Uri[0]);
            }
        }
    }

    public ChromeClient(@NotNull PermissionDelegate permissionDelegate, @NotNull PickerDelegate pickerDelegate, @NotNull Uri bridgeUrl) {
        Intrinsics.checkNotNullParameter(permissionDelegate, "permissionDelegate");
        Intrinsics.checkNotNullParameter(pickerDelegate, "pickerDelegate");
        Intrinsics.checkNotNullParameter(bridgeUrl, "bridgeUrl");
        this.permissionDelegate = permissionDelegate;
        this.pickerDelegate = pickerDelegate;
        this.bridgeUrl = bridgeUrl;
    }

    private final void askPermissionAndTakePicture(ValueCallback<Uri[]> filePathCallback) {
        if (this.permissionDelegate.hasPermission("android.permission.CAMERA")) {
            takePicture(filePathCallback);
        } else {
            this.permissionDelegate.registerForPermission(new String[]{"android.permission.CAMERA"}, new AnonymousClass1(filePathCallback, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void takePicture(ValueCallback<Uri[]> filePathCallback) {
        this.pickerDelegate.openTakePicture(new C21741(filePathCallback));
    }

    @Override // android.webkit.WebChromeClient
    @NotNull
    public Bitmap getDefaultVideoPoster() {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequest(@NotNull PermissionRequest request) {
        String str;
        Intrinsics.checkNotNullParameter(request, "request");
        Uri origin = request.getOrigin();
        if (!Intrinsics.f(origin.getScheme(), this.bridgeUrl.getScheme()) || !Intrinsics.f(origin.getHost(), this.bridgeUrl.getHost()) || origin.getPort() != this.bridgeUrl.getPort()) {
            request.deny();
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String[] resources = request.getResources();
        if (resources != null) {
            for (String str2 : resources) {
                String str3 = "android.webkit.resource.VIDEO_CAPTURE";
                if (Intrinsics.f(str2, "android.webkit.resource.VIDEO_CAPTURE")) {
                    str = "android.permission.CAMERA";
                } else {
                    str3 = "android.webkit.resource.AUDIO_CAPTURE";
                    if (Intrinsics.f(str2, "android.webkit.resource.AUDIO_CAPTURE")) {
                        str = "android.permission.RECORD_AUDIO";
                    }
                }
                arrayList2.add(str);
                arrayList.add(str3);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (!this.permissionDelegate.hasPermission((String) obj2)) {
                arrayList3.add(obj2);
            }
        }
        if (arrayList3.isEmpty()) {
            request.grant((String[]) arrayList.toArray(new String[0]));
        } else {
            this.permissionDelegate.registerForPermission((String[]) arrayList3.toArray(new String[0]), new AnonymousClass2(request, arrayList));
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(@NotNull WebView webView, @NotNull ValueCallback<Uri[]> filePathCallback, @NotNull WebChromeClient.FileChooserParams fileChooserParams) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(filePathCallback, "filePathCallback");
        Intrinsics.checkNotNullParameter(fileChooserParams, "fileChooserParams");
        if (fileChooserParams.isCaptureEnabled()) {
            askPermissionAndTakePicture(filePathCallback);
            return true;
        }
        PickerDelegate pickerDelegate = this.pickerDelegate;
        String[] acceptTypes = fileChooserParams.getAcceptTypes();
        Intrinsics.checkNotNullExpressionValue(acceptTypes, "getAcceptTypes(...)");
        pickerDelegate.openDocumentPicker(acceptTypes, new C21731(filePathCallback));
        return true;
    }
}
