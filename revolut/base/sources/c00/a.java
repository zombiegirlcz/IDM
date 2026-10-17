package c00;

import a10.n;
import buf.u;
import com.revolut.camerakit.validators.config.BlurValidatorConfig;
import com.revolut.camerakit.validators.config.BrightnessValidatorConfig;
import com.revolut.camerakit.validators.config.CompoundValidatorConfig;
import com.revolut.camerakit.validators.config.DocClassifierConfig;
import com.revolut.camerakit.validators.config.DocImageQualityValidatorConfig;
import com.revolut.camerakit.validators.config.DocumentFitFourCornerConfig;
import com.revolut.camerakit.validators.config.FaceInFrameValidatorConfig;
import com.revolut.camerakit.validators.config.FaceQualityValidatorConfig;
import com.revolut.camerakit.validators.config.MrzValidatorConfig;
import com.revolut.camerakit.validators.config.MyNumberCardValidatorConfig;
import com.revolut.camerakit.validators.config.ObjectPositionValidatorConfig;
import com.revolut.camerakit.validators.config.StraightFaceValidatorConfig;
import com.revolut.camerakit.validators.config.ValidatorConfig;
import di0.i;
import dx.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import xv.p;
import zhm.a1;
import zhm.d0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes16.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zw.e f20077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d4m.a f20078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d4m.a f20079c;
    public final d4m.a d;
    public final d4m.a e;
    public final d4m.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d4m.a f20080g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d4m.a f20081h;
    public final d4m.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i4b.f f20082j;
    public final bi0.f k;

    public a(zw.e resourcesStorage, nw.c nullableLazyFactory, d4m.a openCvImageConverter, d4m.a brightnessCalculator, d4m.a blurCalculator, d4m.a matImageConverter, d4m.a cameraKitImageFormatConverter, d4m.a coordinatesTransformer, d4m.a mrzOcrParser, d4m.a revolutFaceValidator, i4b.f revVisionFactory, bi0.f textRecognizerFactory) {
        Intrinsics.checkNotNullParameter(resourcesStorage, "resourcesStorage");
        Intrinsics.checkNotNullParameter(nullableLazyFactory, "nullableLazyFactory");
        Intrinsics.checkNotNullParameter(openCvImageConverter, "openCvImageConverter");
        Intrinsics.checkNotNullParameter(brightnessCalculator, "brightnessCalculator");
        Intrinsics.checkNotNullParameter(blurCalculator, "blurCalculator");
        Intrinsics.checkNotNullParameter(matImageConverter, "matImageConverter");
        Intrinsics.checkNotNullParameter(cameraKitImageFormatConverter, "cameraKitImageFormatConverter");
        Intrinsics.checkNotNullParameter(coordinatesTransformer, "coordinatesTransformer");
        Intrinsics.checkNotNullParameter(mrzOcrParser, "mrzOcrParser");
        Intrinsics.checkNotNullParameter(revolutFaceValidator, "revolutFaceValidator");
        Intrinsics.checkNotNullParameter(revVisionFactory, "revVisionFactory");
        Intrinsics.checkNotNullParameter(textRecognizerFactory, "textRecognizerFactory");
        this.f20077a = resourcesStorage;
        this.f20078b = openCvImageConverter;
        this.f20079c = brightnessCalculator;
        this.d = blurCalculator;
        this.e = matImageConverter;
        this.f = cameraKitImageFormatConverter;
        this.f20080g = coordinatesTransformer;
        this.f20081h = mrzOcrParser;
        this.i = revolutFaceValidator;
        this.f20082j = revVisionFactory;
        this.k = textRecognizerFactory;
    }

    public final LinkedHashSet a(Set configs, l previewMetadata, f00.b customValidatorFactory) {
        p dVar;
        p eVar;
        p pVar;
        p bVar;
        p nVar;
        Intrinsics.checkNotNullParameter(configs, "configs");
        Intrinsics.checkNotNullParameter(previewMetadata, "previewMetadata");
        Intrinsics.checkNotNullParameter(customValidatorFactory, "customValidatorFactory");
        Set<ValidatorConfig> set = configs;
        ArrayList arrayList = new ArrayList(w.t(set, 10));
        for (ValidatorConfig validatorConfig : set) {
            boolean z = validatorConfig instanceof BlurValidatorConfig;
            d4m.a aVar = this.f20078b;
            if (z) {
                Object obj2 = this.d.get();
                Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                Object obj3 = aVar.get();
                Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
                eVar = new a00.e((a00.a) obj2, (BlurValidatorConfig) validatorConfig, previewMetadata, (e00.a) obj3);
            } else if (validatorConfig instanceof BrightnessValidatorConfig) {
                Object obj4 = this.f20079c.get();
                Intrinsics.checkNotNullExpressionValue(obj4, "get(...)");
                Object obj5 = aVar.get();
                Intrinsics.checkNotNullExpressionValue(obj5, "get(...)");
                eVar = new b00.g((b00.b) obj4, (BrightnessValidatorConfig) validatorConfig, previewMetadata, (e00.a) obj5);
            } else if (validatorConfig instanceof ObjectPositionValidatorConfig) {
                eVar = new w00.f((ObjectPositionValidatorConfig) validatorConfig, previewMetadata);
            } else if (validatorConfig instanceof StraightFaceValidatorConfig) {
                eVar = new b10.e((StraightFaceValidatorConfig) validatorConfig);
            } else {
                boolean z3 = validatorConfig instanceof DocumentFitFourCornerConfig;
                d4m.a aVar2 = this.f;
                if (z3) {
                    DocumentFitFourCornerConfig documentFitFourCornerConfig = (DocumentFitFourCornerConfig) validatorConfig;
                    Object obj6 = this.f20080g.get();
                    Intrinsics.checkNotNullExpressionValue(obj6, "get(...)");
                    m00.c cVar = new m00.c(previewMetadata, (f) obj6);
                    kge.d dVarA = nw.c.a(new u(this, documentFitFourCornerConfig, 14));
                    Object obj7 = aVar2.get();
                    Intrinsics.checkNotNullExpressionValue(obj7, "get(...)");
                    eVar = new n00.c(dVarA, cVar, (qw.a) obj7, new jx0.a(documentFitFourCornerConfig));
                } else {
                    boolean z4 = validatorConfig instanceof MrzValidatorConfig;
                    bi0.f fVar = this.k;
                    if (z4) {
                        i iVarB = fVar.b(eh0.c.LATIN);
                        Object obj8 = aVar.get();
                        Intrinsics.checkNotNullExpressionValue(obj8, "get(...)");
                        Object obj9 = this.e.get();
                        Intrinsics.checkNotNullExpressionValue(obj9, "get(...)");
                        Object obj10 = this.f20081h.get();
                        Intrinsics.checkNotNullExpressionValue(obj10, "get(...)");
                        nVar = new x00.i((MrzValidatorConfig) validatorConfig, iVarB, (e00.a) obj8, (g) obj9, (x00.b) obj10, previewMetadata);
                    } else {
                        MyNumberCardValidatorConfig myNumberCardValidatorConfig = MyNumberCardValidatorConfig.f50932a;
                        if (Intrinsics.f(validatorConfig, myNumberCardValidatorConfig)) {
                            i iVarB2 = fVar.b(eh0.c.JAPANESE);
                            Object obj11 = aVar2.get();
                            Intrinsics.checkNotNullExpressionValue(obj11, "get(...)");
                            nVar = new n(iVarB2, (qw.a) obj11);
                        } else if (validatorConfig instanceof FaceInFrameValidatorConfig) {
                            eVar = new p00.a((FaceInFrameValidatorConfig) validatorConfig, previewMetadata);
                        } else if (validatorConfig instanceof FaceQualityValidatorConfig) {
                            FaceQualityValidatorConfig faceQualityValidatorConfig = (FaceQualityValidatorConfig) validatorConfig;
                            if (faceQualityValidatorConfig instanceof FaceQualityValidatorConfig.DownloadableFaceQualityValidatorConfig) {
                                FaceQualityValidatorConfig.DownloadableFaceQualityValidatorConfig downloadableFaceQualityValidatorConfig = (FaceQualityValidatorConfig.DownloadableFaceQualityValidatorConfig) faceQualityValidatorConfig;
                                kge.d dVarA2 = nw.c.a(new u(this, downloadableFaceQualityValidatorConfig, 12));
                                String modelVersion = downloadableFaceQualityValidatorConfig.f50919b;
                                Intrinsics.checkNotNullParameter(modelVersion, "modelVersion");
                                bVar = new s00.b(dVarA2, modelVersion, true, false, false);
                            } else {
                                if (!(faceQualityValidatorConfig instanceof FaceQualityValidatorConfig.RevolutVisionFaceQualityValidatorConfig)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                kge.d dVarA3 = nw.c.a(new bvb.a(this, 6));
                                Intrinsics.checkNotNullParameter("1.0_on_device", "modelVersion");
                                FaceQualityValidatorConfig.RevolutVisionFaceQualityValidatorConfig revolutVisionFaceQualityValidatorConfig = (FaceQualityValidatorConfig.RevolutVisionFaceQualityValidatorConfig) faceQualityValidatorConfig;
                                bVar = new s00.b(dVarA3, "1.0_on_device", revolutVisionFaceQualityValidatorConfig.f50927a, revolutVisionFaceQualityValidatorConfig.f50928b, revolutVisionFaceQualityValidatorConfig.f50929c);
                            }
                            eVar = bVar;
                        } else {
                            if (validatorConfig instanceof DocImageQualityValidatorConfig) {
                                kge.d dVarA4 = nw.c.a(new u(this, (DocImageQualityValidatorConfig) validatorConfig, 15));
                                Object obj12 = aVar2.get();
                                Intrinsics.checkNotNullExpressionValue(obj12, "get(...)");
                                dVar = new k00.b(dVarA4, (qw.a) obj12);
                            } else if (validatorConfig instanceof CompoundValidatorConfig) {
                                CompoundValidatorConfig config = (CompoundValidatorConfig) validatorConfig;
                                LinkedHashMap graph = config.f50903a;
                                Set setKeySet = graph.keySet();
                                f00.b.Companion.getClass();
                                LinkedHashSet validators = a(setKeySet, previewMetadata, f00.a.f130988b);
                                Intrinsics.checkNotNullParameter(config, "config");
                                Intrinsics.checkNotNullParameter(validators, "validators");
                                Intrinsics.checkNotNullParameter(graph, "graph");
                                izl.a aVar3 = new izl.a();
                                Iterator it8 = graph.keySet().iterator();
                                while (it8.hasNext()) {
                                    izl.b.a(aVar3, graph, it8.next());
                                }
                                ArrayList<List> arrayList2 = new ArrayList();
                                Set setKeySet2 = aVar3.f169893a.keySet();
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                for (Object obj13 : setKeySet2) {
                                    Object objA = aVar3.a(obj13);
                                    Object arrayList3 = linkedHashMap.get(objA);
                                    if (arrayList3 == null) {
                                        arrayList3 = new ArrayList();
                                        linkedHashMap.put(objA, arrayList3);
                                    }
                                    ((List) arrayList3).add(obj13);
                                }
                                for (List list : d0.i1(linkedHashMap.values())) {
                                    ArrayList arrayList4 = new ArrayList();
                                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                                    Iterator it9 = list.iterator();
                                    while (it9.hasNext()) {
                                        izl.b.b(new LinkedHashSet(), linkedHashSet, graph, arrayList4, it9.next());
                                    }
                                    arrayList2.add(arrayList4);
                                }
                                ArrayList arrayList5 = new ArrayList();
                                for (List<ValidatorConfig> list2 : arrayList2) {
                                    ArrayList arrayList6 = new ArrayList();
                                    for (ValidatorConfig validatorConfig2 : list2) {
                                        Object obj14 = null;
                                        if (validatorConfig2 instanceof BlurValidatorConfig) {
                                            Iterator it10 = validators.iterator();
                                            while (true) {
                                                if (!it10.hasNext()) {
                                                    break;
                                                }
                                                Object next = it10.next();
                                                if (next instanceof a00.e) {
                                                    obj14 = next;
                                                    break;
                                                }
                                            }
                                            pVar = (p) obj14;
                                        } else if (validatorConfig2 instanceof BrightnessValidatorConfig) {
                                            Iterator it11 = validators.iterator();
                                            while (true) {
                                                if (!it11.hasNext()) {
                                                    break;
                                                }
                                                Object next2 = it11.next();
                                                if (next2 instanceof b00.g) {
                                                    obj14 = next2;
                                                    break;
                                                }
                                            }
                                            pVar = (p) obj14;
                                        } else {
                                            if (validatorConfig2 instanceof CompoundValidatorConfig) {
                                                throw new IllegalStateException("Recursive compound validator is not supported");
                                            }
                                            if (validatorConfig2 instanceof DocImageQualityValidatorConfig) {
                                                Iterator it12 = validators.iterator();
                                                while (true) {
                                                    if (!it12.hasNext()) {
                                                        break;
                                                    }
                                                    Object next3 = it12.next();
                                                    if (next3 instanceof k00.b) {
                                                        obj14 = next3;
                                                        break;
                                                    }
                                                }
                                                pVar = (p) obj14;
                                            } else if (validatorConfig2 instanceof DocumentFitFourCornerConfig) {
                                                Iterator it13 = validators.iterator();
                                                while (true) {
                                                    if (!it13.hasNext()) {
                                                        break;
                                                    }
                                                    Object next4 = it13.next();
                                                    if (next4 instanceof n00.c) {
                                                        obj14 = next4;
                                                        break;
                                                    }
                                                }
                                                pVar = (p) obj14;
                                            } else if (validatorConfig2 instanceof FaceInFrameValidatorConfig) {
                                                Iterator it14 = validators.iterator();
                                                while (true) {
                                                    if (!it14.hasNext()) {
                                                        break;
                                                    }
                                                    Object next5 = it14.next();
                                                    if (next5 instanceof p00.a) {
                                                        obj14 = next5;
                                                        break;
                                                    }
                                                }
                                                pVar = (p) obj14;
                                            } else {
                                                if (validatorConfig2 instanceof FaceQualityValidatorConfig.DownloadableFaceQualityValidatorConfig) {
                                                    throw new IllegalStateException("Will be added to rev_vision later");
                                                }
                                                if (validatorConfig2 instanceof FaceQualityValidatorConfig.RevolutVisionFaceQualityValidatorConfig) {
                                                    Iterator it15 = validators.iterator();
                                                    while (true) {
                                                        if (!it15.hasNext()) {
                                                            break;
                                                        }
                                                        Object next6 = it15.next();
                                                        if (next6 instanceof s00.b) {
                                                            obj14 = next6;
                                                            break;
                                                        }
                                                    }
                                                    pVar = (p) obj14;
                                                } else if (validatorConfig2 instanceof MrzValidatorConfig) {
                                                    Iterator it16 = validators.iterator();
                                                    while (true) {
                                                        if (!it16.hasNext()) {
                                                            break;
                                                        }
                                                        Object next7 = it16.next();
                                                        if (next7 instanceof x00.i) {
                                                            obj14 = next7;
                                                            break;
                                                        }
                                                    }
                                                    pVar = (p) obj14;
                                                } else if (Intrinsics.f(validatorConfig2, myNumberCardValidatorConfig)) {
                                                    Iterator it17 = validators.iterator();
                                                    while (true) {
                                                        if (!it17.hasNext()) {
                                                            break;
                                                        }
                                                        Object next8 = it17.next();
                                                        if (next8 instanceof n) {
                                                            obj14 = next8;
                                                            break;
                                                        }
                                                    }
                                                    pVar = (p) obj14;
                                                } else if (validatorConfig2 instanceof ObjectPositionValidatorConfig) {
                                                    Iterator it18 = validators.iterator();
                                                    while (true) {
                                                        if (!it18.hasNext()) {
                                                            break;
                                                        }
                                                        Object next9 = it18.next();
                                                        if (next9 instanceof w00.f) {
                                                            obj14 = next9;
                                                            break;
                                                        }
                                                    }
                                                    pVar = (p) obj14;
                                                } else if (validatorConfig2 instanceof StraightFaceValidatorConfig) {
                                                    Iterator it19 = validators.iterator();
                                                    while (true) {
                                                        if (!it19.hasNext()) {
                                                            break;
                                                        }
                                                        Object next10 = it19.next();
                                                        if (next10 instanceof b10.e) {
                                                            obj14 = next10;
                                                            break;
                                                        }
                                                    }
                                                    pVar = (p) obj14;
                                                } else {
                                                    if (!(validatorConfig2 instanceof DocClassifierConfig)) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    Iterator it20 = validators.iterator();
                                                    while (true) {
                                                        if (!it20.hasNext()) {
                                                            break;
                                                        }
                                                        Object next11 = it20.next();
                                                        if (next11 instanceof i00.d) {
                                                            obj14 = next11;
                                                            break;
                                                        }
                                                    }
                                                    pVar = (p) obj14;
                                                }
                                            }
                                        }
                                        if (pVar == null) {
                                            throw new IllegalArgumentException("Required value was null.");
                                        }
                                        arrayList6.add(pVar);
                                    }
                                    arrayList5.add(arrayList6);
                                }
                                eVar = new e(arrayList5);
                            } else {
                                if (!(validatorConfig instanceof DocClassifierConfig)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                kge.d dVarA5 = nw.c.a(new u(this, (DocClassifierConfig) validatorConfig, 13));
                                Object obj15 = aVar2.get();
                                Intrinsics.checkNotNullExpressionValue(obj15, "get(...)");
                                dVar = new i00.d(dVarA5, (qw.a) obj15);
                            }
                            eVar = dVar;
                        }
                    }
                    eVar = nVar;
                }
            }
            arrayList.add(eVar);
        }
        Set setI1 = d0.i1(arrayList);
        customValidatorFactory.getClass();
        return a1.l(setI1, h0.f322473a);
    }
}
