package org.tensorflow.lite.support.common.ops;

import org.tensorflow.lite.support.common.TensorOperator;

/* JADX INFO: loaded from: classes14.dex */
public class DequantizeOp extends NormalizeOp implements TensorOperator {
    public DequantizeOp(float f, float f4) {
        super(f, 1.0f / f4);
    }
}
