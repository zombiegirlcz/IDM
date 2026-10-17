package m50;

import com.revolut.chat_core.R$string;
import com.revolut.core.ui_kit.delegates.PhotoDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import e60.o;
import e60.s;
import efm.r;
import ip0.u00;
import java.io.File;
import java.util.Map;
import java.util.UUID;
import k50.n0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import n30.n;
import org.jetbrains.annotations.NotNull;
import y20.g0;
import zhm.d0;
import zhm.r0;
import zhm.u;

/* JADX INFO: loaded from: classes19.dex */
public final class k extends n0 {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e60.a f202782l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final g0 f202783m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j30.c f202784n;
    public final n o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y40.b f202785p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p30.d f202786q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f202787r;

    public k(e60.a mediaPickerControllerExtension, g0 messagesRepository, j30.c chatFeatureToggles, n chatInteractor, y40.b pdfViewExtension, p30.d chatImageInteractor) {
        Intrinsics.checkNotNullParameter(mediaPickerControllerExtension, "mediaPickerControllerExtension");
        Intrinsics.checkNotNullParameter(messagesRepository, "messagesRepository");
        Intrinsics.checkNotNullParameter(chatFeatureToggles, "chatFeatureToggles");
        Intrinsics.checkNotNullParameter(chatInteractor, "chatInteractor");
        Intrinsics.checkNotNullParameter(pdfViewExtension, "pdfViewExtension");
        Intrinsics.checkNotNullParameter(chatImageInteractor, "chatImageInteractor");
        this.f202782l = mediaPickerControllerExtension;
        this.f202783m = messagesRepository;
        this.f202784n = chatFeatureToggles;
        this.o = chatInteractor;
        this.f202785p = pdfViewExtension;
        this.f202786q = chatImageInteractor;
        this.f202787r = 10;
    }

    public static final Object f3(k kVar, rd7.h hVar, Continuation continuation) {
        p30.d dVar = kVar.f202786q;
        if (hVar instanceof rd7.f) {
            String path = ((rd7.f) hVar).f253364a;
            dVar.getClass();
            Intrinsics.checkNotNullParameter(path, "path");
            pfm.a aVar = new pfm.a(dVar.d.e(path), new p24.b(29, new p30.a(dVar, 0)), 4);
            Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
            Object objA = nim.a.a(aVar, continuation);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
        }
        if (!(hVar instanceof rd7.g)) {
            throw new NoWhenBranchMatchedException();
        }
        String url2 = ((rd7.g) hVar).f253366a;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(url2, "url");
        pfm.a aVar2 = new pfm.a(new ufm.i(((qz0.n) dVar.f232559c).d(new UrlImage(url2, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations((CircleTransformation) null, false, true, (Integer) null, (Integer) null, (Integer) null, 475), null, null, false, false, 507902)), new p30.b(0, new p30.a(dVar, 1)), 0), new p30.b(1, new p30.a(dVar, 2)), 4);
        Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
        Object objA2 = nim.a.a(aVar2, continuation);
        return objA2 == fim.a.COROUTINE_SUSPENDED ? objA2 : Unit.f186387a;
    }

    @Override // k50.n0
    public final r Z2() {
        r map = ((s) this.f202782l).f122868g.map(new m30.b(20, new m11.h(this, 14)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    @Override // k50.n0
    public final boolean b3() {
        return ((s) this.f202782l).S();
    }

    @Override // k50.n0
    public final void c3(v20.c message, Integer num) {
        v20.b upload;
        Intrinsics.checkNotNullParameter(message, "message");
        if (num != null) {
            v20.a aVar = (v20.a) d0.e0(num.intValue(), message.getUploads());
            if (aVar == null || (upload = aVar.getUpload()) == null) {
                return;
            }
            if (!z50.k.d(upload.getMediaType())) {
                String mediaType = upload.getMediaType();
                UUID uploadId = upload.getUploadId();
                String thumbnailUrl = upload.getThumbnailUrl();
                File file = upload.i;
                String path = file != null ? file.getPath() : null;
                Map thumbnailUrlHeaders = upload.getThumbnailUrlHeaders();
                if (thumbnailUrlHeaders == null) {
                    thumbnailUrlHeaders = r0.g();
                }
                d3(mediaType, thumbnailUrlHeaders, thumbnailUrl, uploadId, path);
                return;
            }
        }
        T2(new i(num, this, message, null), new yi5.b(27));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005f  */
    @Override // k50.n0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d3(java.lang.String r11, java.util.Map r12, java.lang.String r13, java.util.UUID r14, java.lang.String r15) {
        /*
            r10 = this;
            java.lang.String r0 = "mediaType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "thumbnailUrlHeaders"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            t80.f r0 = t80.f.PDF
            java.lang.String[] r0 = r0.a()
            boolean r0 = kotlin.collections.d.I(r0, r11)
            r1 = 0
            if (r0 == 0) goto L4b
            if (r15 == 0) goto L2c
            boolean r11 = kotlin.text.d0.W(r15)
            if (r11 == 0) goto L20
            goto L2c
        L20:
            java.io.File r11 = new java.io.File
            r11.<init>(r15)
            boolean r12 = r11.exists()
            if (r12 == 0) goto L2c
            goto L2d
        L2c:
            r11 = r1
        L2d:
            if (r11 == 0) goto L35
            y40.b r12 = r10.f202785p
            r12.b3(r11)
            return
        L35:
            if (r14 == 0) goto L48
            m2f.b0 r11 = new m2f.b0
            r12 = 2
            r11.<init>(r10, r14, r1, r12)
            yi5.b r12 = new yi5.b
            r13 = 27
            r12.<init>(r13)
            r10.T2(r11, r12)
            return
        L48:
            r4 = r10
            goto Lb3
        L4b:
            boolean r11 = z50.k.d(r11)
            if (r11 == 0) goto L48
            if (r15 == 0) goto L5f
            java.io.File r11 = new java.io.File
            r11.<init>(r15)
            boolean r14 = r11.exists()
            if (r14 == 0) goto L5f
            goto L60
        L5f:
            r11 = r1
        L60:
            if (r13 == 0) goto L69
            boolean r14 = kotlin.text.d0.W(r13)
            if (r14 != 0) goto L69
            goto L6a
        L69:
            r13 = r1
        L6a:
            if (r11 == 0) goto L72
            rd7.f r12 = new rd7.f
            r12.<init>(r11, r1)
            goto L89
        L72:
            if (r13 == 0) goto L88
            rd7.g r11 = new rd7.g
            com.revolut.core.ui_kit_core.displayers.image.models.UrlImage$SimpleCustomHeaders r14 = new com.revolut.core.ui_kit_core.displayers.image.models.UrlImage$SimpleCustomHeaders
            java.lang.String r15 = "X-Device-Id"
            java.util.Set r15 = zhm.y0.b(r15)
            r14.<init>(r15, r12)
            r12 = 8
            r11.<init>(r13, r14, r12)
            r12 = r11
            goto L89
        L88:
            r12 = r1
        L89:
            if (r12 != 0) goto L8c
            goto L48
        L8c:
            com.revolut.feature.image_gallery.ImageGalleryController r11 = new com.revolut.feature.image_gallery.ImageGalleryController
            rd7.j r13 = new rd7.j
            java.util.List r12 = zhm.u.c(r12)
            r14 = 0
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r15 = 4
            r13.<init>(r12, r14, r15)
            k50.b2 r2 = new k50.b2
            r8 = 0
            r9 = 7
            r3 = 2
            java.lang.Class<m50.k> r5 = m50.k.class
            java.lang.String r6 = "shareGalleryImage"
            java.lang.String r7 = "shareGalleryImage(Lcom/revolut/feature/image_gallery/ImageGalleryImageItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r11.<init>(r13, r2, r1, r15)
            r12 = 3
            yji.n.P2(r10, r11, r1, r1, r12)
        Lb3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m50.k.d3(java.lang.String, java.util.Map, java.lang.String, java.util.UUID, java.lang.String):void");
    }

    @Override // k50.n0
    public final void e3(int i, boolean z) {
        this.f202787r = i;
        if (!z) {
            PhotoDelegate.a.C0417a photoSource = new PhotoDelegate.a.C0417a(u00.BACK);
            s sVar = (s) this.f202782l;
            sVar.getClass();
            Intrinsics.checkNotNullParameter(photoSource, "photoSource");
            sVar.f.g3(photoSource);
            return;
        }
        this.f202784n.getClass();
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.chat_attachment_sheet_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.chat_attachment_sheet_caption, null, null, 14);
        u00 u00Var = u00.BACK;
        int i2 = R$string.chat_attachment_sheet_option_choose_file;
        int i3 = R$drawable.uikit_icn_24_document;
        aim.e eVarB = u.b();
        o.Companion.getClass();
        eVarB.addAll(e60.b.f122837b);
        eVarB.add(t80.f.HEIC);
        T2(new j(this, new e60.i(null, textLocalisedClause, textLocalisedClause2, true, i2, i3, null, u.a(eVarB), false, u00Var, null, 11585), null), new yi5.b(27));
    }
}
