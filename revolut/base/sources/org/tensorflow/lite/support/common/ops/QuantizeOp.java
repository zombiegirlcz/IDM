package org.tensorflow.lite.support.common.ops;

import org.tensorflow.lite.support.common.TensorOperator;

/* JADX INFO: loaded from: classes14.dex */
public class QuantizeOp extends NormalizeOp implements TensorOperator {
    public QuantizeOp(float f, float f4) {
        super((-f) * f4, f4);
    }
}
